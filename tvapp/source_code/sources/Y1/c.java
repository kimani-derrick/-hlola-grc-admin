package Y1;

import Z1.e;
import android.content.Context;
import c2.AbstractC0390a;
import c2.C0391b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class c implements V1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4314a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4315b;

    public c() {
        this.f4314a = 0;
        this.f4315b = AbstractC0390a.f7252a;
    }

    @Override // y5.InterfaceC1496a
    public final Object get() {
        Object obj = this.f4315b;
        switch (this.f4314a) {
            case 0:
                C0391b c0391b = (C0391b) ((InterfaceC1496a) obj).get();
                HashMap hashMap = new HashMap();
                Q1.c cVar = Q1.c.f2849q;
                Set emptySet = Collections.emptySet();
                if (emptySet != null) {
                    Long l7 = 30000L;
                    Long l8 = 86400000L;
                    hashMap.put(cVar, new Z1.c(l7.longValue(), l8.longValue(), emptySet));
                    Q1.c cVar2 = Q1.c.f2851s;
                    Set emptySet2 = Collections.emptySet();
                    if (emptySet2 != null) {
                        Long l9 = 1000L;
                        Long l10 = 86400000L;
                        hashMap.put(cVar2, new Z1.c(l9.longValue(), l10.longValue(), emptySet2));
                        Q1.c cVar3 = Q1.c.f2850r;
                        if (Collections.emptySet() != null) {
                            Long l11 = 86400000L;
                            Long l12 = 86400000L;
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(e.f4554r)));
                            if (unmodifiableSet != null) {
                                hashMap.put(cVar3, new Z1.c(l11.longValue(), l12.longValue(), unmodifiableSet));
                                if (c0391b != null) {
                                    if (hashMap.keySet().size() >= Q1.c.values().length) {
                                        new HashMap();
                                        return new Z1.b(c0391b, hashMap);
                                    }
                                    throw new IllegalStateException("Not all priorities have been configured");
                                }
                                throw new NullPointerException("missing required property: clock");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            case 1:
                String packageName = ((Context) ((InterfaceC1496a) obj).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return obj;
        }
    }

    public /* synthetic */ c(int i7, Object obj) {
        this.f4314a = i7;
        this.f4315b = obj;
    }
}
