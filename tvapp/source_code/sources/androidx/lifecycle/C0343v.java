package androidx.lifecycle;
/* renamed from: androidx.lifecycle.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343v {

    /* renamed from: a  reason: collision with root package name */
    public EnumC0337o f6826a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0340s f6827b;

    public final void a(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        EnumC0337o a7 = enumC0336n.a();
        EnumC0337o enumC0337o = this.f6826a;
        M5.g.f(enumC0337o, "state1");
        if (a7.compareTo(enumC0337o) < 0) {
            enumC0337o = a7;
        }
        this.f6826a = enumC0337o;
        this.f6827b.d(interfaceC0342u, enumC0336n);
        this.f6826a = a7;
    }
}
