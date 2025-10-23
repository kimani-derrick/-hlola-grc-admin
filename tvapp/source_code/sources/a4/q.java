package a4;

import H2.C0002c;
import g4.C0736a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class q implements S3.m {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f5175a = Logger.getLogger(q.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5176b = {0};

    /* renamed from: c  reason: collision with root package name */
    public static final q f5177c = new Object();

    @Override // S3.m
    public final Class a() {
        return S3.j.class;
    }

    @Override // S3.m
    public final Object b(C0002c c0002c) {
        byte[] copyOf;
        for (List<S3.k> list : ((ConcurrentMap) c0002c.f1017r).values()) {
            for (S3.k kVar : list) {
                S3.b bVar = kVar.f3154h;
                if (bVar instanceof o) {
                    o oVar = (o) bVar;
                    byte[] bArr = kVar.f3151c;
                    if (bArr == null) {
                        copyOf = null;
                    } else {
                        copyOf = Arrays.copyOf(bArr, bArr.length);
                    }
                    C0736a a7 = C0736a.a(copyOf);
                    if (!a7.equals(oVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + oVar.c() + " has wrong output prefix (" + oVar.b() + ") instead of (" + a7 + ")");
                    }
                }
            }
        }
        return new p(c0002c);
    }

    @Override // S3.m
    public final Class c() {
        return S3.j.class;
    }
}
