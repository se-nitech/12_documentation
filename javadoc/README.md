# javadocのサンプル

起動

```bash
docker compose build
docker compose up -d
```

doxygenの実行

```bash
docker compose exec mypython javadoc -d docs Compute.java AddOrMult.java Main.java
```

停止

```bash
docker compose down
```
