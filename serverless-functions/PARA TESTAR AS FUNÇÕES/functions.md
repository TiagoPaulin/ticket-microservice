**FUNCTIONS - TICKET.IT**

# CRUD USER

Fields:

{

    "name": "NOME DO USUÁRIO",

    "cpf": "CPF DO USUÁRIO",

    "birthDate": "DATA DE NASCIMENTO DO USUÁRIO",

    "email": "EMAIL DO USUÁRIO",

    "password": "SENHA DO USUÁRIO"

}


## CREATE (POST)

url: https://serverless-ticketit.azurewebsites.net/api/users?

body:

{

    "name": "Gabriel Felipe Jess Meira",

    "cpf": "132.456.089-42",

    "birthDate": "10/04/2004",

    "email": "gabrielfjmeira@gmail.com",

    "password": "senha123"

}

{

    "name": "Tiago Vieira Paulin",

    "cpf": "719.406.290-98",

    "birthDate": "12/11/2002",

    "email": "tiagovp@gmail.com",

    "password": "senha456"

}

{

    "name": "Brunno Tatsuo",

    "cpf": "225.757.220-39",

    "birthDate": "29/09/1992",

    "email": "brunnotatsuo@gmail.com",

    "password": "senha789"

}

## READ (GET)

url (get all): https://serverless-ticketit.azurewebsites.net/api/users?

url (get by id): https://serverless-ticketit.azurewebsites.net/api/users/{id}?

example: https://serverless-ticketit.azurewebsites.net/api/users/88864c19-2a10-4746-85a2-8f93e0af8f5b

## UPDATE (PUT)

url: https://serverless-ticketit.azurewebsites.net/api/users/{id}?

example: https://serverless-ticketit.azurewebsites.net/api/users/88864c19-2a10-4746-85a2-8f93e0af8f5b

body:

{

    "name": "Gabriel Felipe Jess Meira",

    "cpf": "132.456.089-42",

    "birthDate": "10/04/2004",

    "email": "gabrielfjmeira@gmail.com",

    "password": "123senha"

}

## DELETE (DELETE)

url: https://serverless-ticketit.azurewebsites.net/api/users/{id}?

example: https://serverless-ticketit.azurewebsites.net/api/users/77f69e12-c981-449b-a137-60081acd3b4f

# CRUD PHONE

Fields:

{

    "ddi": "DDI DO TELEFONE",

    "ddd": "DDD DO TELEFONE",

    "number": "NÚMERO DO TELEFONE",

    "user_id": "USUÁRIO DO TELEFONE"

}

## CREATE (POST)

url: https://serverless-ticketit.azurewebsites.net/api/phones_create_a_phone?

body:

{

    "ddi": "55",

    "ddd": "41",

    "number": "984961004",

    "user_id": "88864c19-2a10-4746-85a2-8f93e0af8f5b"

}

{

    "ddi": "55",

    "ddd": "41",

    "number": "984911345",

    "user_id": "29084ee4-d36e-47a0-90d5-69802eda8457"

}


## READ (GET)

url (get all): https://serverless-ticketit.azurewebsites.net/api/phones_get_phones

url (get by id): https://serverless-ticketit.azurewebsites.net/api/phones/{id}?

example: https://serverless-ticketit.azurewebsites.net/api/phones/dc54b00e-be8c-4653-b602-6c6c360205f3

## UPDATE (PUT)

url: https://serverless-ticketit.azurewebsites.net/api/phone/{id}?

example: https://serverless-ticketit.azurewebsites.net/api/phone/dc54b00e-be8c-4653-b602-6c6c360205f3

body:

{

    "ddi": "55",

    "ddd": "42",

    "number": "984961004",

    "user_id": "88864c19-2a10-4746-85a2-8f93e0af8f5b"

}

## DELETE (DELETE)

url: https://serverless-ticketit.azurewebsites.net/api/phones/{id}?

example: https://serverless-ticketit.azurewebsites.net/api/phones/009204b4-c6ec-49d7-b0d9-49d2f2c73bb6