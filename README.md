# 🚀 Bootcamp Manager - Sistema Educacional em Java

![Java](https://img.shields.io/badge/Java-17+-blue)
![POO](https://img.shields.io/badge/Paradigma-Orientado%20a%20Objetos-green)
![GitHub](https://img.shields.io/badge/GitHub-Repositório-lightgrey)

## 📋 Índice
- [Visão Geral](#-visão-geral)
- [Diagrama de Classes](#-diagrama-de-classes)
- [Funcionalidades](#-funcionalidades)
- [Como Executar](#-como-executar)
- [Estrutura do Código](#-estrutura-do-código)
- [Regras de XP](#-regras-de-xp)
- [Contribuição](#-contribuição)
- [Licença](#-licença)

## 🌐 Visão Geral
Sistema de gerenciamento de bootcamps educacionais que permite:
- Cadastro de cursos e mentorias
- Inscrição de desenvolvedores
- Acompanhamento de progresso
- Cálculo automático de experiência (XP)

## 📐 Diagrama de Classes
```mermaid
classDiagram
    class Bootcamp {
        -String nome
        -String descricao
        -LocalDate dataInicial
        -LocalDate dataFinal
        +gerarRelatorioProgresso()
    }
    
    class Conteudo {
        <<abstract>>
        -String titulo
        -String descricao
        +calcularXp()* double
    }
    
    Bootcamp "1" *-- "*" Conteudo
    Conteudo <|-- Curso
    Conteudo <|-- Mentoria
    Bootcamp "1" -- "*" Dev
