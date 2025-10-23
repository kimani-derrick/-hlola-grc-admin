package u4;

import android.util.Log;
import h6.InterfaceC0754d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import x6.AbstractC1471d;
import x6.AbstractC1479l;
import x6.C1484q;
import x6.InterfaceC1472e;
import x6.InterfaceC1480m;
import x6.J;
import x6.O;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15060a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15061b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15062c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f15063e;
    public final Object f;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(h4.f r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f15062c = r0
            t3.h r0 = new t3.h
            r0.<init>()
            r6.d = r0
            r0 = 0
            r6.f15060a = r0
            t3.h r1 = new t3.h
            r1.<init>()
            r6.f15063e = r1
            r7.a()
            android.content.Context r1 = r7.f10987a
            r6.f15061b = r7
            java.lang.String r7 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r7 = r1.getSharedPreferences(r7, r0)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3d
            r6.f15060a = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L3e
        L3d:
            r7 = r5
        L3e:
            if (r7 != 0) goto L84
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r1 == 0) goto L71
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            boolean r2 = r2.containsKey(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            boolean r7 = r1.getBoolean(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            goto L72
        L69:
            r7 = move-exception
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L71:
            r7 = r5
        L72:
            if (r7 != 0) goto L78
            r6.f15060a = r0
            r7 = r5
            goto L84
        L78:
            r6.f15060a = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L84:
            r6.f = r7
            java.lang.Object r7 = r6.f15062c
            monitor-enter(r7)
            boolean r0 = r6.c()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L99
            java.lang.Object r0 = r6.d     // Catch: java.lang.Throwable -> L97
            t3.h r0 = (t3.C1244h) r0     // Catch: java.lang.Throwable -> L97
            r0.b(r5)     // Catch: java.lang.Throwable -> L97
            goto L99
        L97:
            r0 = move-exception
            goto L9b
        L99:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            return
        L9b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.v.<init>(h4.f):void");
    }

    public InterfaceC1472e a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i7 = indexOf; i7 < size; i7++) {
            InterfaceC1472e a7 = ((AbstractC1471d) list.get(i7)).a(type, annotationArr);
            if (a7 != null) {
                return a7;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC1471d) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public Object b(Class cls) {
        Method[] declaredMethods;
        boolean isDefault;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f15060a) {
                J j7 = J.f16240c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (j7.f16241a) {
                        isDefault = method.isDefault();
                        if (isDefault) {
                        }
                    }
                    if (!Modifier.isStatic(method.getModifiers())) {
                        d(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new O(this, cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public synchronized boolean c() {
        boolean z7;
        Boolean bool = (Boolean) this.f;
        if (bool != null) {
            z7 = bool.booleanValue();
        } else {
            try {
                z7 = ((h4.f) this.f15061b).h();
            } catch (IllegalStateException unused) {
                z7 = false;
            }
        }
        e(z7);
        return z7;
    }

    public C1484q d(Method method) {
        C1484q c1484q;
        C1484q c1484q2 = (C1484q) ((ConcurrentHashMap) this.f15061b).get(method);
        if (c1484q2 != null) {
            return c1484q2;
        }
        synchronized (((ConcurrentHashMap) this.f15061b)) {
            try {
                c1484q = (C1484q) ((ConcurrentHashMap) this.f15061b).get(method);
                if (c1484q == null) {
                    c1484q = C1484q.b(this, method);
                    ((ConcurrentHashMap) this.f15061b).put(method, c1484q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1484q;
    }

    public void e(boolean z7) {
        String str;
        String str2;
        if (z7) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (((Boolean) this.f) == null) {
            str2 = "global Firebase setting";
        } else if (this.f15060a) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String str3 = "Crashlytics automatic data collection " + str + " by " + str2 + ".";
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str3, null);
        }
    }

    public InterfaceC1480m f(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f15063e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i7 = indexOf; i7 < size; i7++) {
            InterfaceC1480m a7 = ((AbstractC1479l) list.get(i7)).a(type, annotationArr);
            if (a7 != null) {
                return a7;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC1479l) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public InterfaceC1480m g(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f15063e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i7 = indexOf; i7 < size; i7++) {
            InterfaceC1480m b7 = ((AbstractC1479l) list.get(i7)).b(type, annotationArr, this);
            if (b7 != null) {
                return b7;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC1479l) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public void h(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f15063e;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC1479l) list.get(i7)).getClass();
        }
    }

    public v(InterfaceC0754d interfaceC0754d, h6.t tVar, List list, List list2) {
        this.f15061b = new ConcurrentHashMap();
        this.f15062c = interfaceC0754d;
        this.d = tVar;
        this.f15063e = list;
        this.f = list2;
        this.f15060a = false;
    }
}
