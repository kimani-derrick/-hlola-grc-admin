package T1;

import H2.D;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final i f3262a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3263b;

    /* renamed from: c  reason: collision with root package name */
    public final Q1.b f3264c;
    public final Q1.d d;

    /* renamed from: e  reason: collision with root package name */
    public final u f3265e;

    public t(i iVar, String str, Q1.b bVar, Q1.d dVar, u uVar) {
        this.f3262a = iVar;
        this.f3263b = str;
        this.f3264c = bVar;
        this.d = dVar;
        this.f3265e = uVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [z4.b, java.lang.Object] */
    public final void a(Q1.a aVar, Q1.f fVar) {
        i iVar = this.f3262a;
        if (iVar != null) {
            String str = this.f3263b;
            if (str != null) {
                Q1.d dVar = this.d;
                if (dVar != null) {
                    Q1.b bVar = this.f3264c;
                    if (bVar != null) {
                        u uVar = this.f3265e;
                        uVar.getClass();
                        i b7 = iVar.b(aVar.f2847b);
                        ?? obj = new Object();
                        obj.f = new HashMap();
                        obj.d = Long.valueOf(uVar.f3267a.a());
                        obj.f16464e = Long.valueOf(uVar.f3268b.a());
                        obj.f16461a = str;
                        obj.w(new m(bVar, (byte[]) dVar.apply(aVar.f2846a)));
                        obj.f16462b = null;
                        h f = obj.f();
                        Y1.a aVar2 = (Y1.a) uVar.f3269c;
                        aVar2.getClass();
                        aVar2.f4311b.execute(new D(aVar2, b7, fVar, f, 1));
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
