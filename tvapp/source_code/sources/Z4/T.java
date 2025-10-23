package Z4;

import W5.InterfaceC0116x;
import a5.C0217c;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import k3.AbstractC0958a;
import u4.C1287k;
import z5.C1530l;
/* loaded from: classes.dex */
public final class T extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f4792u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C4.b f4793v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ List f4794w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C4.b bVar, List list, D5.d dVar) {
        super(2, dVar);
        this.f4793v = bVar;
        this.f4794w = list;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new T(this.f4793v, this.f4794w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((T) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Comparator] */
    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f4792u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0217c c0217c = C0217c.f5189a;
            this.f4792u = 1;
            obj = c0217c.b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection<C1287k> values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                for (C1287k c1287k : values) {
                    if (c1287k.f15006a.c()) {
                        C4.b bVar = this.f4793v;
                        List list = this.f4794w;
                        for (Message message : A5.k.h0(A5.k.U(A5.l.M(C4.b.b(bVar, list, 2), C4.b.b(bVar, list, 1))), new Object())) {
                            if (((Messenger) bVar.f422s) != null) {
                                try {
                                    Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                    Messenger messenger = (Messenger) bVar.f422s;
                                    if (messenger != null) {
                                        messenger.send(message);
                                    }
                                } catch (RemoteException e3) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e3);
                                }
                            }
                            bVar.P(message);
                        }
                    }
                }
            }
            Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
        }
        return C1530l.f16479a;
    }
}
