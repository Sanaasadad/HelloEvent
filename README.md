# HelloEvents App

Application web de réservation de billets pour des événements, développée avec Spring Boot, JPA, Spring Security JWT, et MySQL/PostgreSQL.

## 🚀 Fonctionnalités principales

### 👤 Client
- Affichage des événements sur la page d'accueil
- Inscription, connexion, gestion du profil
- Recherche par catégorie, lieu, date
- Réservation de billets
- Page "À propos" avec l’équipe et les valeurs

### 🔐 Administrateur
- Tableau de bord (statistiques)
- Gestion des comptes clients
- Gestion des événements (CRUD)

## 🛠️ Technologies utilisées
- Spring Boot
- Spring MVC
- Spring Security (JWT)
- Spring Data JPA
- JUnit
- MySQL / PostgreSQL

## 🔒 Sécurité
- Authentification JWT
- Rôles : CLIENT / ADMIN
- Gestion des exceptions

## 📁 Architecture
controller
service
repository
model/entity
dto
mapper
security

## 📊 Diagrammes UML
Les diagrammes sont dans le dossier `/diagrammes` :
- Use Case
- Classe
- Séquence

## ✅ Tests
- Collection Postman : `/postman/HelloEventsCollection.json`
- Tests unitaires avec JUnit

## 📦 Installation locale
```bash
git clone https://github.com/Sanaasadad/HelloEvent.git
cd HelloEvent
mvn spring-boot:run
