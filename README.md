# Library Apps
Final project upskilled academy

# ERD
![alt text](https://github.com/andikaopp/library-apps/blob/main/ERD.png?raw=true)

# Design Microservices
![alt text](https://github.com/andikaopp/library-apps/blob/main/diagram.png?raw=true)

# Environment
- Cloud : AWS EC2
- Database : RDS
- CI/CD : Github Action

# API Spesification

## Authentication
Request :
- Method : POST
- Endpoint : `/api/authentication`
- Header :
    - Content-Type : application/json
    - Accept : application-json
- Body :

```json
{
    "username" : "string",
    "password" : "string",
}
```

- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "token" : "string"
    }
}
```
## USER
### Create User
Request :
- Method : POST
- Endpoint : `/api/users`
- Header :
    - Content-Type : application/json
    - Accept : application-json
    - Authorization : Bearer {token}
- Body :

```json
{
    "id" : "string, unique",
    "email" : "string",
    "username" : "string",
    "password" : "string",
    "phone" : "string"
}
```

- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "email" : "string",
        "username" : "string",
        "phone" : "string",
        "createdAt" : "date"
    }
}
```

### Get User
Request :
- Method : GET
- Endpoint : `/api/users/{id_user}`
- Header :
    - Accept : application-json
    - Authorization : Bearer {token}
- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "email" : "string",
        "username" : "string",
        "phone" : "string",
        "createdAt" : "date"
    }
}
```

## Borrower
### Create borrower
Request :
- Method : POST
- Endpoint : `/api/borrowers`
- Header :
    - Content-Type : application/json
    - Accept : application-json
    - Authorization : Bearer {token}
- Body :

```json
{
    "id" : "string, unique",
    "name" : "string",
    "email" : "string",
    "phone" : "string",
    "address" : "string"
}
```

- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "name" : "string",
        "email" : "string",
        "phone" : "string",
        "address" : "string",
        "createdAt" : "date"
    }
}
```

### Get Borrower
Request :
- Method : GET
- Endpoint : `/api/borrowers/{id_borrower}`
- Header :
    - Accept : application-json
    - Authorization : Bearer {token}
- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "name" : "string",
        "email" : "string",
        "phone" : "string",
        "address" : "string",
        "createdAt" : "date"
    }
}
```

## Book Vendor
### Create Book Vendor
Request :
- Method : POST
- Endpoint : `/api/vendors`
- Header :
    - Content-Type : application/json
    - Accept : application-json
    - Authorization : Bearer {token}
- Body :

```json
{
    "id" : "string, unique",
    "vendor_name" : "string",
    "contact_person" : "string",
    "email" : "string",
    "phone" : "string",
    "address" : "string",
    "join_date" : "date",
    "status" : "char"
}
```

- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "vendor_name" : "string",
        "contact_person" : "string",
        "email" : "string",
        "phone" : "string",
        "address" : "string",
        "join_date" : "date",
        "status" : "char"
    }
}
```

### Get Book Vendor
Request :
- Method : GET
- Endpoint : `/api/vendors/{id_vendor}`
- Header :
    - Accept : application-json
    - Authorization : Bearer {token}
- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "vendor_name" : "string",
        "contact_person" : "string",
        "email" : "string",
        "phone" : "string",
        "address" : "string",
        "join_date" : "date",
        "status" : "char",
        "createdAt" : "date"
    }
}
```

## Books
### Create Book
Request :
- Method : POST
- Endpoint : `/api/books`
- Header :
    - Content-Type : application/json
    - Accept : application-json
    - Authorization : Bearer {token}
- Body :

```json
{
    "id" : "string, unique",
    "title" : "string",
    "summary" : "string",
    "page" : "integer",
    "author" : "string",
    "year" : "string",
    "vendor_id" : "string"
}
```

- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "title" : "string",
        "summary" : "string",
        "page" : "integer",
        "author" : "string",
        "year" : "string",
        "vendor_id" : "string"
    }
}
```

### Get Book
Request :
- Method : GET
- Endpoint : `/api/books/{id_book}`
- Header :
    - Accept : application-json
    - Authorization : Bearer {token}
- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "title" : "string",
        "summary" : "string",
        "page" : "integer",
        "author" : "string",
        "year" : "string",
        "vendor_id" : "string",
        "createdAt" : "date"
    }
}
```

### Update Book
Request :
- Method : PUT
- Endpoint : `/api/books/{id_book}`
- Header :
    - Content-Type : application/json
    - Accept : application-json
    - Authorization : Bearer {token}
- Body :

```json
{
    "title" : "string",
    "summary" : "string",
    "page" : "integer",
    "author" : "string",
    "year" : "string",
    "vendor_id" : "string"
}
```

- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "title" : "string",
        "summary" : "string",
        "page" : "integer",
        "author" : "string",
        "year" : "string",
        "vendor_id" : "string"
    }
}
```

### Delete Book
Request :
- Method : DELETE
- Endpoint : `/api/books/{id_book}`
- Header :
    - Accept : application-json
    - Authorization : Bearer {token}
- Response :
```json
{
    "code" : "string",
    "message" : "string",
}
```