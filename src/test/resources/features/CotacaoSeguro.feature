#language: pt
Funcionalidade: Realizar cotação de seguro

  Cenário: Realizar cotação com sucesso
    Dado que eu acesse a página de cotação de seguros
    Quando preencher os dados do veículo
      | Make                    | BMW            |
      | Model                   | Motorcycle     |
      | Cylinder Capacity [ccm] |              2 |
      | Engine Performance [kW] |            100 |
      | Date of Manufacture     | 01/01/2022     |
      | Number of Seats         |              2 |
      | Fuel Type               | Electric Power |
      | Payload [kg]            |            132 |
      | Total Weight [kg]       |            147 |
      | List Price [$]          |           8000 |
      | Annual Mileage [mi]     |           5000 |
    E os dados do segurado
      | First Name    | Daniel     |
      | Last Name     | Santos     |
      | Date of Birth | 01/19/1990 |
      | Country       | Brazil     |
      | Zip Code      |   72631136 |
      | Occupation    | Employee   |
      | Hobbies       | Skydiving  |
    E os dados do produto
      | Insurance Sum     |    7.000.000,00 |
      | Merit Rating      | Bonus 5         |
      | Damage Insurance  | Full Coverage   |
      | Optional Products | Euro Protection |
      | Courtesy Car      | Yes             |
    E selecionar o preço
      | Plan | Platinum |
    E os dados de contato
      | E-Mail   | daniel.santos@sampleapp.com |
      | Username | DanielSantos                |
      | Password | Daniel123                   |
    Então será enviado o formulário para o e-mail informado
