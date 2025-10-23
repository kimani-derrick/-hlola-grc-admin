package B3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
/* loaded from: classes.dex */
public final class b extends p6.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f190a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f191b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f190a = i7;
        this.f191b = obj;
    }

    @Override // p6.d
    public final void v(int i7) {
        switch (this.f190a) {
            case 0:
                return;
            default:
                F3.i iVar = (F3.i) this.f191b;
                iVar.d = true;
                F3.h hVar = (F3.h) iVar.f722e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // p6.d
    public final void w(Typeface typeface, boolean z7) {
        CharSequence text;
        switch (this.f190a) {
            case 0:
                Chip chip = (Chip) this.f191b;
                f fVar = chip.f8827u;
                if (fVar.f221T0) {
                    text = fVar.f222U;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z7) {
                    F3.i iVar = (F3.i) this.f191b;
                    iVar.d = true;
                    F3.h hVar = (F3.h) iVar.f722e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void J(int i7) {
    }
}
