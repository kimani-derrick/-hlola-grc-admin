package L3;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
/* loaded from: classes.dex */
public final class l extends F3.j {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2078q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ r f2079r;

    public /* synthetic */ l(r rVar, int i7) {
        this.f2078q = i7;
        this.f2079r = rVar;
    }

    @Override // F3.j, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.f2078q) {
            case 0:
                q qVar = (q) this.f2079r;
                EditText editText = qVar.f2096a.getEditText();
                if (editText instanceof AutoCompleteTextView) {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                    if (qVar.n.isTouchExplorationEnabled() && q.f(autoCompleteTextView) && !qVar.f2098c.hasFocus()) {
                        autoCompleteTextView.dismissDropDown();
                    }
                    autoCompleteTextView.post(new R3.a(this, autoCompleteTextView, 4, false));
                    return;
                }
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            default:
                return;
        }
    }

    @Override // F3.j, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        switch (this.f2078q) {
            case 1:
                u uVar = (u) this.f2079r;
                uVar.f2098c.setChecked(!u.d(uVar));
                return;
            default:
                return;
        }
    }
}
