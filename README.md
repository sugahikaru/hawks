# 野球選手情報システム管理

***

## 概要

野球選手情報システムは、CRUDアプリでREAD・CREATE・UPDATE・DELETE機能を実装可能です。
CRUD処理とは選手情報の登録、更新、取得、削除が可能ということです

---

## 構成要件

* Java 17
* SpringBoot 3.2.7
* MySQL 8.0.37
* Docker 25.0.0
* JUnit
* Mockito

---

## 機能一覧

| 機能   | 詳細               | URL           |
|------|------------------|---------------|
| 全件取得 | 選手一覧を返す          | /players      |
| 選手検索 | idを入力して検索        | /players/{id} |
| 新規登録 | 新しい選手を登録する       | /players      |
| 選手更新 | 指定したidの選手情報を変更する | /players/{id} |
| 選手削除 | 指定したidの選手情報を削除する | /players/{id} |

## DBテーブル

テーブル名：players

| **カラム名** |  **データ型**   | **NotNull** | **キー** | **備考**  |
|:--------:|:-----------:|:-----------:|:------:|:-------:|
|    id    |     int     |  NOT NULL   |  主キー   | ID,自動生成 |
|   name   | VARCHAR(20) |  NOT NULL   |        |   選手名   |
|  number  |     int     |  NOT NULL   |        |   背番号   |
|   team   | VARCHAR(20) |  NOT NULL   |        |  チーム名   |

---

## 実行結果

<details>
<summary><h4> 1-1. GET /live 一覧表示 </h4></summary>

!sq.png
</details>
<details>

<summary><h4> 1-2. GET /live/{id} idを指定して検索 </h4></summary>

![スクリーンショット 2024-06-17 222841 sssss.png](..%2F..%2FPictures%2F%83%58%83%4E%83%8A%81%5B%83%93%83%56%83%87%83%62%83%67%202024-06-17%20222841%20sssss.png)
</details>


hello
world




