package L3;

import android.text.method.PasswordTransformationMethod;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f2062b;

    public /* synthetic */ d(r rVar, int i7) {
        this.f2061a = i7;
        this.f2062b = rVar;
    }

    public final void a(TextInputLayout textInputLayout, int i7) {
        switch (this.f2061a) {
            case 0:
                EditText editText = textInputLayout.getEditText();
                if (editText != null && i7 == 2) {
                    editText.post(new R3.a(this, editText, 3, false));
                    if (editText.getOnFocusChangeListener() == ((h) this.f2062b).f2069e) {
                        editText.setOnFocusChangeListener(null);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
                if (autoCompleteTextView != null && i7 == 3) {
                    autoCompleteTextView.post(new R3.a(this, autoCompleteTextView, 5, false));
                    if (autoCompleteTextView.getOnFocusChangeListener() == ((q) this.f2062b).f2086e) {
                        autoCompleteTextView.setOnFocusChangeListener(null);
                    }
                    autoCompleteTextView.setOnTouchListener(null);
                    autoCompleteTextView.setOnDismissListener(null);
                    return;
                }
                return;
            default:
                EditText editText2 = textInputLayout.getEditText();
                if (editText2 != null && i7 == 1) {
                    editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    editText2.post(new R3.a(this, editText2, 6, false));
                    return;
                }
                return;
        }
    }
}
