package x6;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import z5.C1530l;
/* renamed from: x6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1469b extends AbstractC1479l {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16306a;

    @Override // x6.AbstractC1479l
    public final InterfaceC1480m a(Type type, Annotation[] annotationArr) {
        if (h6.E.class.isAssignableFrom(V.f(type))) {
            return C1468a.f16301t;
        }
        return null;
    }

    @Override // x6.AbstractC1479l
    public final InterfaceC1480m b(Type type, Annotation[] annotationArr, u4.v vVar) {
        if (type == h6.I.class) {
            if (V.i(annotationArr, z6.w.class)) {
                return C1468a.f16302u;
            }
            return C1468a.f16300s;
        } else if (type == Void.class) {
            return C1468a.f16304w;
        } else {
            if (this.f16306a && type == C1530l.class) {
                try {
                    return C1468a.f16303v;
                } catch (NoClassDefFoundError unused) {
                    this.f16306a = false;
                    return null;
                }
            }
            return null;
        }
    }
}
