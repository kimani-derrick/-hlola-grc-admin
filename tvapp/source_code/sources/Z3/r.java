package Z3;

import H2.C0002c;
import c4.C0392a;
import c4.C0393b;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public abstract class r implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final L4.f f4729a = new L4.f(14);

    public static void a(C0002c c0002c) {
        Integer num;
        S3.f fVar;
        ArrayList arrayList = new ArrayList();
        C0392a c0392a = C0392a.f7269b;
        for (List<S3.k> list : ((ConcurrentMap) c0002c.f1017r).values()) {
            for (S3.k kVar : list) {
                int ordinal = kVar.d.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            fVar = S3.f.f3143e;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        fVar = S3.f.d;
                    }
                } else {
                    fVar = S3.f.f3142c;
                }
                String str = kVar.f3153g;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                arrayList.add(new C0393b(fVar, kVar.f, str, kVar.f3152e.name()));
            }
        }
        S3.k kVar2 = (S3.k) c0002c.f1018s;
        if (kVar2 != null) {
            num = Integer.valueOf(kVar2.f);
        } else {
            num = null;
        }
        if (num != null) {
            try {
                int intValue = num.intValue();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C0393b) it.next()).f7272b == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
