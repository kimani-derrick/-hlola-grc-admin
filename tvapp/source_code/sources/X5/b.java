package X5;

import W5.C0114v;
import W5.InterfaceC0115w;
/* loaded from: classes.dex */
public final class b extends D5.a implements InterfaceC0115w {
    private volatile Object _preHandler;

    public b() {
        super(C0114v.f4027q);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L24;
     */
    @Override // W5.InterfaceC0115w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(D5.i r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r0 > r3) goto L4a
            r0 = 28
            if (r3 >= r0) goto L4a
            java.lang.Object r3 = r2._preHandler
            r0 = 0
            if (r3 == r2) goto L12
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            goto L32
        L12:
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L2f
            int r1 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            int r1 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r3 = r0
        L30:
            r2._preHandler = r3
        L32:
            if (r3 == 0) goto L39
            java.lang.Object r3 = r3.invoke(r0, r0)
            goto L3a
        L39:
            r3 = r0
        L3a:
            boolean r1 = r3 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L41
            r0 = r3
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L41:
            if (r0 == 0) goto L4a
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r0.uncaughtException(r3, r4)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X5.b.h(D5.i, java.lang.Throwable):void");
    }
}
