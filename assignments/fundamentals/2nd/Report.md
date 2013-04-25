Assignment Report for 2.2
------

以下に、課題の回答を記入してください。

Activity と Fragment
======

### Activity

3. ライフサイクルのコールバックメソッドの呼び出し順
【起動】
onCreate
onStart
onResume
(待機)

【homeボタン押下】
onPause
onStop
(待機)

【待機中のアプリを再起動】
onRestart
onStart
onResume
(待機)

【再度homeボタン押下】
onPause
onStop
(待機)

【タスクキラーアプリでプロセスを終了させ、再起動】
onCreate
onStart
onResume
(待機)

【戻るボタンによりアプリを終了】
onPause
onStop
onDestroy
(終了)