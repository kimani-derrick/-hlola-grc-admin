package P1;

import android.content.res.TypedArray;
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f2764r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i7) {
        super(0);
        this.f2764r = i7;
        switch (i7) {
            case 1:
                super(0);
                return;
            default:
                ((d) this.f2765q).f2778p = true;
                return;
        }
    }

    @Override // P1.c
    public c i(TypedArray typedArray) {
        switch (this.f2764r) {
            case 1:
                super.i(typedArray);
                boolean hasValue = typedArray.hasValue(2);
                d dVar = (d) this.f2765q;
                if (hasValue) {
                    dVar.f2769e = (typedArray.getColor(2, dVar.f2769e) & 16777215) | (dVar.f2769e & (-16777216));
                }
                if (typedArray.hasValue(12)) {
                    dVar.d = typedArray.getColor(12, dVar.d);
                }
                return this;
            default:
                return super.i(typedArray);
        }
    }

    @Override // P1.c
    public final c m() {
        int i7 = this.f2764r;
        return this;
    }
}
