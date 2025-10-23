package u5;

import androidx.fragment.app.D;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import java.util.Set;
import l0.C0967c;
/* renamed from: u5.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1298f implements Y {

    /* renamed from: a  reason: collision with root package name */
    public final Set f15075a;

    /* renamed from: b  reason: collision with root package name */
    public final Y f15076b;

    /* renamed from: c  reason: collision with root package name */
    public final C1296d f15077c;

    public C1298f(Set set, Y y3, D d) {
        this.f15075a = set;
        this.f15076b = y3;
        this.f15077c = new C1296d(d);
    }

    @Override // androidx.lifecycle.Y
    public final V a(Class cls) {
        if (this.f15075a.contains(cls.getName())) {
            return this.f15077c.a(cls);
        }
        return this.f15076b.a(cls);
    }

    @Override // androidx.lifecycle.Y
    public final V b(Class cls, C0967c c0967c) {
        if (this.f15075a.contains(cls.getName())) {
            return this.f15077c.b(cls, c0967c);
        }
        return this.f15076b.b(cls, c0967c);
    }
}
