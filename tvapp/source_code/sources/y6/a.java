package y6;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import n5.m;
import n5.y;
import u4.v;
import x6.AbstractC1479l;
import x6.InterfaceC1480m;
/* loaded from: classes.dex */
public final class a extends AbstractC1479l {

    /* renamed from: a  reason: collision with root package name */
    public final y f16372a;

    public a(y yVar) {
        this.f16372a = yVar;
    }

    public static a c(y yVar) {
        if (yVar != null) {
            return new a(yVar);
        }
        throw new NullPointerException("moshi == null");
    }

    public static Set d(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(m.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return Collections.emptySet();
    }

    @Override // x6.AbstractC1479l
    public final InterfaceC1480m a(Type type, Annotation[] annotationArr) {
        return new b(this.f16372a.c(type, d(annotationArr), null));
    }

    @Override // x6.AbstractC1479l
    public final InterfaceC1480m b(Type type, Annotation[] annotationArr, v vVar) {
        return new c(this.f16372a.c(type, d(annotationArr), null));
    }
}
