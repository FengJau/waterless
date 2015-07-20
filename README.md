# waterless
Project for waterless group question.

## Question
sbt使用 semantic version 来进行版本号管理。版本主体由三部分组成，从左到右分别是主版本, 副版本和补丁版本。每一部分是一个非负整数，如0.13.7, 0.12.9。 在比较版本时，先比较主版本，版本号较大者版本较新；如果主版本号相同，则副版本号较大者版本较新；如果副版本号也相同，则补丁版本号较大者较新。

在发布正式版本之前，通常还会发布若干个RC版本，形如 0.13.7-RC1，其中 RC1 部分由RC加上正整数RC版本号构成。RC版本总是比相同主体版本号的正式版本要旧，但比所有主体版本号比自己旧的 正式版本和RC版本要新。如果主体版本号相同，则RC版本号大的较新。

请编写方法 def latest(vers: Seq[String]): String 从一个sematic version版本集合中找出最新的版本号。可以美好假设集合中至少有一个版本号，而且所有版本号各不相同。

### Example：
```scala
  assert(latest(List("0.13.7", "0.9.10", "0.9.11-RC1")) == "0.13.7")
  assert(latest(List("0.13.6", "0.13.7-RC1", "0.13.7-RC2")) == "0.13.7-RC2")
```

### Requirement：
1. 请在github上创建完整的sbt项目，使用Scala语言解决本题。将项目链接作为入群问题的答案。
2. 用ScalaTest, Specs2或ScalaCheck编写测试（我们也接受使用JUnit或其它工具编写的测试）。
3. 本群也欢迎猎头及HR人员入群，此类请将公司招聘网页的链接或招聘文档百度网盘链接作为入群问题的答案。


## Implement

### ManageVersion

### ManageVersion2(*Experimental*)
limitation： The version number is less than 2.

