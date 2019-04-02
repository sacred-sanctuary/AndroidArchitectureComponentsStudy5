# Android Architecture Components Study 5

[Android Architecture Components 勉強会 #5](https://gdg-tokyo.connpass.com/event/123068/)  
での課題取り組みの実装例

## 課題2.2
各Lifecycle.Eventを@OnLifecycleEventに指定したメソッドを定義し、呼び出されたときにログに出力する

## Activityの起動時
```
I/System.out: ON_CREATE : CREATED
I/System.out: ON_ANY : CREATED
I/System.out: ON_START : STARTED
I/System.out: ON_ANY : STARTED
I/System.out: ON_RESUME : RESUMED
I/System.out: ON_ANY : RESUMED
```

## Back KeyによるActivityの終了時
```
I/System.out: ON_PAUSE : STARTED
I/System.out: ON_ANY : STARTED
I/System.out: ON_STOP : CREATED
I/System.out: ON_ANY : CREATED
I/System.out: ON_DESTROY : DESTROYED
I/System.out: ON_ANY : DESTROYED
```

## Home KeyによるHome App表示時
```
I/System.out: ON_PAUSE : STARTED
I/System.out: ON_ANY : STARTED
I/System.out: ON_STOP : CREATED
I/System.out: ON_ANY : CREATED
```

## Recents KeyによるRecent Appの表示時
```
I/System.out: ON_PAUSE : STARTED
I/System.out: ON_ANY : STARTED
I/System.out: ON_STOP : CREATED
I/System.out: ON_ANY : CREATED
```

## Recent AppからActivityの起動時(Activityは終了済み)
```
I/System.out: ON_CREATE : CREATED
I/System.out: ON_ANY : CREATED
I/System.out: ON_START : STARTED
I/System.out: ON_ANY : STARTED
I/System.out: ON_RESUME : RESUMED
I/System.out: ON_ANY : RESUMED
```

## Recent AppからActivityの起動時(ActivityはStop中)
```
I/System.out: ON_START : STARTED
I/System.out: ON_ANY : STARTED
I/System.out: ON_RESUME : RESUMED
I/System.out: ON_ANY : RESUMED
```

## Recent AppからActivity削除時(ActivityはStop中)
```
I/System.out: ON_DESTROY : DESTROYED
I/System.out: ON_ANY : DESTROYED
```

## Multi-Window ModeでActivityのフォーカスが外れた時
```
I/System.out: ON_PAUSE : STARTED
I/System.out: ON_ANY : STARTED
```

## Multi-Window ModeでActivityがフォーカスを得た時
```
I/System.out: ON_RESUME : RESUMED
I/System.out: ON_ANY : RESUMED
```

