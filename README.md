# Android Architecture Components Study 5

[Android Architecture Components 勉強会 #5](https://gdg-tokyo.connpass.com/event/123068/)  
での課題取り組みの実装例

## 課題1.1
Activityの各ライフサイクルメソッドでLifecycleのcurrentStateを確認する


## Activityの起動時
```
I/System.out: onCreate : INITIALIZED
I/System.out: onStart : CREATED
I/System.out: onResume : STARTED
```

## Back KeyによるActivityの終了時
```
I/System.out: onPause : STARTED
I/System.out: onStop : CREATED
I/System.out: onDestroy : DESTROYED
```

## Home KeyによるHome App表示時
```
I/System.out: onPause : STARTED
I/System.out: onStop : CREATED
I/System.out: onSaveInstanceState : CREATED
```

## Recents KeyによるRecent Appの表示時
```
I/System.out: onPause : STARTED
I/System.out: onStop : CREATED
I/System.out: onSaveInstanceState : CREATED
```

## Recent AppからActivityの起動時(Activityは終了済み)
```
I/System.out: onCreate : INITIALIZED
I/System.out: onStart : CREATED
I/System.out: onResume : STARTED
```

## Recent AppからActivityの起動時(ActivityはStop中)
```
I/System.out: onRestart : CREATED
I/System.out: onStart : CREATED
I/System.out: onResume : STARTED
```

## Recent AppからActivity削除時(ActivityはStop中)
```
I/System.out: onDestroy : DESTROYED
```

## Multi-Window ModeでActivityのフォーカスが外れた時
```
I/System.out: onPause : STARTED
```

## Multi-Window ModeでActivityがフォーカスを得た時
```
I/System.out: onResume : STARTED
```

