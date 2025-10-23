package L3;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public final class i extends r {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(TextInputLayout textInputLayout, int i7) {
        super(textInputLayout);
        this.d = i7;
    }

    @Override // L3.r
    public final void a() {
        switch (this.d) {
            case 0:
                TextInputLayout textInputLayout = this.f2096a;
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                return;
            default:
                TextInputLayout textInputLayout2 = this.f2096a;
                textInputLayout2.setEndIconOnClickListener(null);
                textInputLayout2.setEndIconDrawable((Drawable) null);
                textInputLayout2.setEndIconContentDescription((CharSequence) null);
                return;
        }
    }
}
