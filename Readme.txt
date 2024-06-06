Projeto de E-commerce com Spring Boot

Descrição
Este projeto é uma aplicação de e-commerce desenvolvida com Spring Boot. O objetivo é fornecer uma plataforma simples para gerenciamento de produtos, categorias, pedidos, pagamentos e usuários.

Modelo de Domínio
O modelo de domínio da aplicação está representado na figura abaixo:


Entidades Principais
Product
id: Integer
name: String
description: String
price: Double
imgUrl: String

Category
id: Integer
name: String

Order
id: Integer
moment: Date
orderStatus: OrderStatus

OrderItem
quantity: Integer
price: Double
subTotal(): double

Payment
id: Integer
moment: Date

User
id: Integer
name: String
email: String
phone: String
password: String

OrderStatus (enum)
WAITING_PAYMENT: int
PAID: int
SHIPPED: int
DELIVERED: int
CANCELED: int

Requisitos
Java 11 ou superior
Spring Boot 2.5.4 ou superior
Maven 3.6.3 ou superior
