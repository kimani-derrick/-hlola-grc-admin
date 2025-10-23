package com.google.crypto.tink.shaded.protobuf;
/* renamed from: com.google.crypto.tink.shaded.protobuf.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540s implements O {

    /* renamed from: b  reason: collision with root package name */
    public static final C0540s f9161b = new C0540s(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9162a;

    public /* synthetic */ C0540s(int i7) {
        this.f9162a = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final boolean a(Class cls) {
        switch (this.f9162a) {
            case 0:
                return AbstractC0543v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final a0 b(Class cls) {
        switch (this.f9162a) {
            case 0:
                if (AbstractC0543v.class.isAssignableFrom(cls)) {
                    try {
                        return (a0) AbstractC0543v.l(cls.asSubclass(AbstractC0543v.class)).k(3);
                    } catch (Exception e3) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
