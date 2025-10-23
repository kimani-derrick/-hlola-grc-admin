package Z4;

import W5.InterfaceC0116x;
import a5.C0217c;
import a5.C0219e;
import a5.EnumC0218d;
import android.util.Log;
import java.util.Map;
import java.util.Objects;
import k3.AbstractC0958a;
import u4.C1286j;
import u4.C1287k;
import z4.C1518b;
import z5.C1530l;
/* loaded from: classes.dex */
public final class P extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f4788u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f4789v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(String str, D5.d dVar) {
        super(2, dVar);
        this.f4789v = str;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new P(this.f4789v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((P) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f4788u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0217c c0217c = C0217c.f5189a;
            this.f4788u = 1;
            obj = c0217c.b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = this.f4789v;
        for (C1287k c1287k : ((Map) obj).values()) {
            C0219e c0219e = new C0219e(str);
            c1287k.getClass();
            String str2 = "App Quality Sessions session changed: " + c0219e;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            C1286j c1286j = c1287k.f15007b;
            synchronized (c1286j) {
                if (!Objects.equals((String) c1286j.f15005s, str)) {
                    C1286j.a((C1518b) c1286j.f15004r, c1286j.f15003q, str);
                    c1286j.f15005s = str;
                }
            }
            Log.d("SessionLifecycleClient", "Notified " + EnumC0218d.f5191q + " of new session " + str);
        }
        return C1530l.f16479a;
    }
}
