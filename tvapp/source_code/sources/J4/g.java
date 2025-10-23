package J4;
/* loaded from: classes.dex */
public final class g implements G4.g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1436a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1437b = false;

    /* renamed from: c  reason: collision with root package name */
    public G4.c f1438c;
    public final e d;

    public g(e eVar) {
        this.d = eVar;
    }

    @Override // G4.g
    public final G4.g a(String str) {
        if (!this.f1436a) {
            this.f1436a = true;
            this.d.h(this.f1438c, str, this.f1437b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // G4.g
    public final G4.g d(boolean z7) {
        if (!this.f1436a) {
            this.f1436a = true;
            this.d.d(this.f1438c, z7 ? 1 : 0, this.f1437b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
