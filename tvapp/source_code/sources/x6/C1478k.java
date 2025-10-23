package x6;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* renamed from: x6.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1478k extends AbstractC1471d {

    /* renamed from: a  reason: collision with root package name */
    public static final C1478k f16312a = new Object();

    @Override // x6.AbstractC1471d
    public final InterfaceC1472e a(Type type, Annotation[] annotationArr) {
        if (V.f(type) != AbstractC1474g.a()) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e3 = V.e(0, (ParameterizedType) type);
            if (V.f(e3) != N.class) {
                return new C1476i(0, e3);
            }
            if (e3 instanceof ParameterizedType) {
                return new C1476i(1, V.e(0, (ParameterizedType) e3));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
