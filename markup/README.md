# Markdownのサンプル

起動

```bash
docker compose build
docker compose up -d
```

フォーマット変換

```bash
docker compose exec mypython pandoc -f markdown -t html -o md_to_html.html markdown.md
docker compose exec mypython pandoc -f markdown -t docx -o md_to_docx.docx markdown.md
```

停止

```bash
docker compose down
```

## マークアップ言語とは

- プレーンテキストで構造化された文書を作成する
  - wikipediaの定義：[文書に注釈を付けるための方法，本文のテキストとは構文的に区別できる](https://en.wikipedia.org/wiki/Markup_language)
  - 例：HTML（HyperText **Markup Language**）
  - 多数の言語がある
    - <https://en.wikipedia.org/wiki/List_of_markup_languages>
- 用途
  - 少しフォーマットをつけて手軽にドキュメントを書きたい
    - コメントに最適
  - 代表例
    - Markdown（拡張子.md）
    - reStructuered Text（拡張子.rst）
