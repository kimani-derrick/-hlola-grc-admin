package n5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/* renamed from: n5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046c extends AbstractC1043D {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f12685k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Class f12686l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f12687m;

    public /* synthetic */ C1046c(Object obj, Class cls, int i7) {
        this.f12685k = i7;
        this.f12687m = obj;
        this.f12686l = cls;
    }

    @Override // n5.AbstractC1043D
    public final Object e() {
        Object obj = this.f12687m;
        switch (this.f12685k) {
            case 0:
                return ((Constructor) obj).newInstance(null);
            default:
                return ((Method) obj).invoke(null, this.f12686l, Object.class);
        }
    }

    public final String toString() {
        switch (this.f12685k) {
            case 0:
                return this.f12686l.getName();
            default:
                return this.f12686l.getName();
        }
    }
}
