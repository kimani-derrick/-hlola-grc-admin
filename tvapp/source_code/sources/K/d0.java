package K;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
/* loaded from: classes.dex */
public class d0 extends c0 {
    public d0(i0 i0Var, WindowInsets windowInsets) {
        super(i0Var, windowInsets);
    }

    @Override // K.h0
    public i0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f1472c.consumeDisplayCutout();
        return i0.d(consumeDisplayCutout, null);
    }

    @Override // K.h0
    public C0034j e() {
        DisplayCutout displayCutout;
        displayCutout = this.f1472c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0034j(displayCutout);
    }

    @Override // K.b0, K.h0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (Objects.equals(this.f1472c, d0Var.f1472c) && Objects.equals(this.f1473e, d0Var.f1473e)) {
            return true;
        }
        return false;
    }

    @Override // K.h0
    public int hashCode() {
        return this.f1472c.hashCode();
    }
}
