# Library Apps
Final project upskilled academy

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

## Reader
### Create reader
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
    "reader_name" : "string",
    "address" : "string",
    "phone" : "integer",
    "email" : "string",
    "gender" : "string",
    "is_borrower" : "integer"
}
```

- Response :
```json
{
    "code" : "string",
    "message" : "string",
    "data" : {
        "id" : "string, unique",
        "reader_name" : "string",
        "address" : "string",
        "phone" : "integer",
        "email" : "string",
        "gender" : "string",
        "is_borrower" : "integer",
        "createdAt" : "date"
    }
}
```

### Get Reader
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
        "id" : "string, unique",
        "reader_name" : "string",
        "address" : "string",
        "phone" : "integer",
        "email" : "string",
        "gender" : "string",
        "is_borrower" : "integer",
        "createdAt" : "date"
    }
}
```

## Book Vendor
### Create Book Vendor
Request :
- Method : POST
- Endpoint : `/api/vendor`
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
        "status" : "char"
    }
}
```

### Get Book Vendor
Request :
- Method : GET
- Endpoint : `/api/vendor/{id_vendor}`
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
        "status" : "char"
    }
}
```

## Books
### Create Book
Request :
- Method : POST
- Endpoint : `/api/book`
- Header :
    - Content-Type : application/json
    - Accept : application-json
    - Authorization : Bearer {token}
- Body :

```json
{
    "id" : "string, unique",
    "title" : "string",
    "author" : "string",
    "summary" : "string",
    "pages" : "integer",
    "author" : "string",
    "year" : "integer",
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
        "author" : "string",
        "summary" : "string",
        "pages" : "integer",
        "author" : "string",
        "year" : "integer",
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
        "author" : "string",
        "summary" : "string",
        "pages" : "integer",
        "author" : "string",
        "year" : "integer",
        "vendor_id" : "string"
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
    "author" : "string",
    "summary" : "string",
    "pages" : "integer",
    "author" : "string",
    "year" : "integer",
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
        "author" : "string",
        "summary" : "string",
        "pages" : "integer",
        "author" : "string",
        "year" : "integer",
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
