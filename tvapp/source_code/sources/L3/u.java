package L3;

import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.boxhdo.android.tv.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class u extends r {
    public final l d;

    /* renamed from: e  reason: collision with root package name */
    public final c f2121e;
    public final d f;

    public u(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new l(this, 1);
        this.f2121e = new c(this, 2);
        this.f = new d(this, 2);
    }

    public static boolean d(u uVar) {
        EditText editText = uVar.f2096a.getEditText();
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    @Override // L3.r
    public final void a() {
        Drawable i02 = android.support.v4.media.session.b.i0(this.f2097b, R.drawable.design_password_eye);
        TextInputLayout textInputLayout = this.f2096a;
        textInputLayout.setEndIconDrawable(i02);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconOnClickListener(new e(2, this));
        LinkedHashSet linkedHashSet = textInputLayout.f9005u0;
        c cVar = this.f2121e;
        linkedHashSet.add(cVar);
        if (textInputLayout.f9004u != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.y0.add(this.f);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}
