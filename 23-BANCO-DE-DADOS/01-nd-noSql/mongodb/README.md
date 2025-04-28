# Conectando ao mongo do docker

`docker exec -it db mongo --host db:27017 -w dio -p dio`

## Passos para conectar ao MongoDB no Docker pelo terminal

1. Certifique-se de que o container do MongoDB está em execução:
   ```bash
   docker ps
   ```
   Verifique se o container do MongoDB aparece na lista.

2. Conecte-se ao container usando o comando `docker exec`:
   ```bash
   docker exec -it <nome_do_container> mongo
   ```
   Substitua `<nome_do_container>` pelo nome do container MongoDB (por exemplo, `db`).

3. Caso precise especificar o host e a porta:
   ```bash
   docker exec -it <nome_do_container> mongo --host <host>:<porta>
   ```
   Substitua `<host>` e `<porta>` pelos valores apropriados (por exemplo, `db:27017`).

4. Após executar o comando, você estará no shell interativo do MongoDB.

Exemplo:
```bash
docker exec -it db mongo --host db:27017
```