package x6;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
/* renamed from: x6.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1482o extends AbstractC1471d {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16315a;

    public C1482o(Executor executor) {
        this.f16315a = executor;
    }

    @Override // x6.AbstractC1471d
    public final InterfaceC1472e a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (V.f(type) != InterfaceC1470c.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e3 = V.e(0, (ParameterizedType) type);
            if (!V.i(annotationArr, P.class)) {
                executor = this.f16315a;
            }
            return new t2.i(e3, executor, 15, false);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
