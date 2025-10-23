package U4;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k.V0;
import v4.C1326d;
import v4.C1329g;
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3460a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3461b;

    public /* synthetic */ l(int i7, Object obj) {
        this.f3460a = i7;
        this.f3461b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f3461b
            V4.q r0 = (V4.q) r0
            monitor-enter(r0)
            r1 = 0
            android.content.Context r2 = r0.f3727a     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L36
            java.lang.String r3 = r0.f3728b     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L36
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L36
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L3e
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L3e
            r5 = 0
            r2.read(r4, r5, r3)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L3e
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L3e
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L3e
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L3e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L3e
            V4.g r1 = V4.g.a(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Throwable -> L3e
        L28:
            r2.close()     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r0)
            goto L43
        L2d:
            r1 = move-exception
            goto L41
        L2f:
            r1 = move-exception
            goto L38
        L31:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L38
        L36:
            r2 = r1
            goto L3e
        L38:
            if (r2 == 0) goto L3d
            r2.close()     // Catch: java.lang.Throwable -> L2d
        L3d:
            throw r1     // Catch: java.lang.Throwable -> L2d
        L3e:
            if (r2 == 0) goto L2b
            goto L28
        L41:
            monitor-exit(r0)
            throw r1
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.l.a():java.lang.Object");
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Map map;
        switch (this.f3460a) {
            case 0:
                return ((p) this.f3461b).a();
            case 1:
                return a();
            default:
                L0.b bVar = (L0.b) this.f3461b;
                ((AtomicReference) bVar.f1864c).set(null);
                synchronized (bVar) {
                    try {
                        if (((AtomicMarkableReference) bVar.f1863b).isMarked()) {
                            map = ((C1326d) ((AtomicMarkableReference) bVar.f1863b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f1863b;
                            atomicMarkableReference.set((C1326d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (map != null) {
                    V0 v02 = (V0) bVar.d;
                    ((C1329g) v02.f11960a).g((String) v02.f11962c, map, bVar.f1862a);
                }
                return null;
        }
    }
}
