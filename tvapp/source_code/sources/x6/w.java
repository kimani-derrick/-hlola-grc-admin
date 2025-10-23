package x6;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import k.C0852F;
/* loaded from: classes.dex */
public final class w extends AbstractC1479l {

    /* renamed from: a  reason: collision with root package name */
    public static final w f16338a = new Object();

    @Override // x6.AbstractC1479l
    public final InterfaceC1480m b(Type type, Annotation[] annotationArr, u4.v vVar) {
        if (V.f(type) != AbstractC1474g.g()) {
            return null;
        }
        return new C0852F(29, vVar.g(V.e(0, (ParameterizedType) type), annotationArr));
    }
}
