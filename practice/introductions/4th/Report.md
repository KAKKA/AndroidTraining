Practice Report for 1.4
------

実習のレポートを下記に記述してください

1. (実習)Android SDK 内の、下記の 2 つのディレクトリにあるコマンドを列挙してください。
[tools]
apkbuilder         emulator           emulator64-mips    jobb               monkeyrunner       emulator-arm       emulator64-x86         
ddms               emulator-mips      etc1tool           lint               source.properties  traceview          
android            dmtracedump        emulator-x86       hierarchyviewer    mksdcard           sqlite3            uiautomatorviewer  
draw9patch         emulator64-arm     hprof-conv         monitor            zipalign 

[platform-tools]
adb	api	dx	lib	renderscript
aapt	aidl	dexdump   fastboot  llvm-rs-cc  source.properties

2. (実習)上記のディレクトリにパスを通し、下記のコマンドを実行してください。
[adb devices]
List of devices attached 
TA19302CTP     device

[adb shell]
90201710n:~ nobuhisa.hirata$ adb shell
$ cd /data/data
$ ls
opendir failed, Permission denied

3. (実習)adb shellコマンドを使って、Android 内のファイルシステムにアクセスし、下記の項目を確認してください。
[adb shell ls]
90201710n:~ nobuhisa.hirata$ adb shell
$ cd /data/data
$ ls
opendir failed, Permission denied

[/sdcard/Android/data ls]
com.motorola.blur.home
com.google.android.apps.maps
jp.mixi
jp.naver.line.android
com.android.providers.media
com.tombarrasso.android.wp7ui
com.Ohiru
jp.ameba
com.google.android.apps.genie.geniewidget.news-content-cache
com.dropbox.android
com.google.android.youtube
com.google.android.videos
com.google.android.music
jp.naver.SJLINEPANG
com.nhn.android.band
jp.naver.linetools
org.mozilla.firefox
com.piviandco.mixbooth
com.chartboost.sdk
com.kakao.talk
_com.maxmpz.audioplayer
com.springpad
com.gr_oo_vy

[端末のSD カード領域に、ローカルにあるファイルを転送する]
90201710n:~ nobuhisa.hirata$ adb -s TA19302CTP push ./Downloads/LimeChat_2.34/doc/README.md /sdcard/Unko/unko.txt
114 KB/s (1495 bytes in 0.012s)
90201710n:~ nobuhisa.hirata$ adb shell
$ cd /sdcard/Unko/
$ ls
unko.txt

[端末のSD カード領域から、ローカルにファイルを転送する]
90201710n:~ nobuhisa.hirata$ adb -s TA19302CTP pull /sdcard/Unko/unko.txt ./Downloads/Unko.txt
182 KB/s (1495 bytes in 0.007s)
90201710n:~ nobuhisa.hirata$ ls Downloads/
.DS_Store
.localized
About Downloads.lpdf/
Dropbox 2.0.6.dmg
KeyRemap4MacBook-8.0.0.dmg
LimeChat_2.34/
LimeChat_2.34.tbz
LockTight_0.1.1/
LockTight_0.1.1.zip
MacPorts-2.1.3/
MacPorts-2.1.3.tar.bz2
Thunderbird 17.0.5.dmg
Unko.txt
adt-bundle-mac-x86_64-20130219/
adt-bundle-mac-x86_64-20130219.zip
git-1.8.2-intel-universal-snow-leopard.dmg
googlejapaneseinput (1).dmg
googlejapaneseinput.dmg

[課題用サンプルプロジェクトの apk ファイルをコマンド経由で端末にインストールする]

[インストールしたアプリを、コマンド経由でアンインストールする]