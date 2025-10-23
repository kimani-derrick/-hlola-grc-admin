package o6;

import java.io.IOException;
/* loaded from: classes.dex */
public final class l extends k6.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f13022e;
    public final /* synthetic */ boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ E f13023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, m mVar, E e3) {
        super(str, true);
        this.f13022e = mVar;
        this.f13023g = e3;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, M5.o] */
    @Override // k6.a
    public final long a() {
        long a7;
        int i7;
        int i8;
        A[] aArr;
        m mVar = this.f13022e;
        boolean z7 = this.f;
        E e3 = this.f13023g;
        mVar.getClass();
        M5.g.f(e3, "settings");
        ?? obj = new Object();
        s sVar = mVar.f13025r;
        synchronized (sVar.f13052O) {
            synchronized (sVar) {
                E e7 = sVar.f13046I;
                if (!z7) {
                    E e8 = new E();
                    e8.b(e7);
                    e8.b(e3);
                    e3 = e8;
                }
                obj.f2315q = e3;
                a7 = e3.a() - e7.a();
                i7 = (a7 > 0L ? 1 : (a7 == 0L ? 0 : -1));
                i8 = 0;
                if (i7 != 0 && !sVar.f13057s.isEmpty()) {
                    Object[] array = sVar.f13057s.values().toArray(new A[0]);
                    if (array != null) {
                        aArr = (A[]) array;
                        E e9 = (E) obj.f2315q;
                        M5.g.f(e9, "<set-?>");
                        sVar.f13046I = e9;
                        sVar.f13039A.c(new j(M5.g.k(" onSettings", sVar.f13058t), sVar, obj, 0), 0L);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }
                aArr = null;
                E e92 = (E) obj.f2315q;
                M5.g.f(e92, "<set-?>");
                sVar.f13046I = e92;
                sVar.f13039A.c(new j(M5.g.k(" onSettings", sVar.f13058t), sVar, obj, 0), 0L);
            }
            try {
                sVar.f13052O.a((E) obj.f2315q);
            } catch (IOException e10) {
                sVar.b(e10);
            }
        }
        if (aArr != null) {
            int length = aArr.length;
            while (i8 < length) {
                A a8 = aArr[i8];
                i8++;
                synchronized (a8) {
                    a8.f += a7;
                    if (i7 > 0) {
                        a8.notifyAll();
                    }
                }
            }
            return -1L;
        }
        return -1L;
    }
}
