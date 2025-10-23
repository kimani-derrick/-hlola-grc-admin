package L3;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public final class m extends w {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f2080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f2080e = qVar;
    }

    @Override // L3.w, K.C0026b
    public final void d(View view, L.i iVar) {
        boolean e3;
        super.d(view, iVar);
        if (!q.f(this.f2080e.f2096a.getEditText())) {
            iVar.i("android.widget.Spinner");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            e3 = iVar.f1854a.isShowingHintText();
        } else {
            e3 = iVar.e(4);
        }
        if (e3) {
            iVar.l(null);
        }
    }

    @Override // K.C0026b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        q qVar = this.f2080e;
        EditText editText = qVar.f2096a.getEditText();
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (accessibilityEvent.getEventType() == 1 && qVar.n.isTouchExplorationEnabled() && !q.f(qVar.f2096a.getEditText())) {
                q.d(qVar, autoCompleteTextView);
                return;
            }
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
}
