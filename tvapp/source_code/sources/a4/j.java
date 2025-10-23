package a4;

import H2.C0002c;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class j implements S3.m {

    /* renamed from: a  reason: collision with root package name */
    public static final j f5163a = new Object();

    @Override // S3.m
    public final Class a() {
        return h.class;
    }

    @Override // S3.m
    public final Object b(C0002c c0002c) {
        if (((S3.k) c0002c.f1018s) != null) {
            for (List<S3.k> list : ((ConcurrentMap) c0002c.f1017r).values()) {
                for (S3.k kVar : list) {
                    h hVar = (h) kVar.f3149a;
                }
            }
            return new Object();
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }

    @Override // S3.m
    public final Class c() {
        return h.class;
    }
}
