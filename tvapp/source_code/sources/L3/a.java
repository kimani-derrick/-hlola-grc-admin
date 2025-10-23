package L3;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public final class a implements TextWatcher {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2055q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f2056r;

    public /* synthetic */ a(int i7, Object obj) {
        this.f2055q = i7;
        this.f2056r = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z7;
        switch (this.f2055q) {
            case 0:
                h hVar = (h) this.f2056r;
                if (hVar.f2096a.getSuffixText() == null) {
                    if (hVar.f2096a.hasFocus() && editable.length() > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    hVar.d(z7);
                    return;
                }
                return;
            case 1:
                TextInputLayout textInputLayout = (TextInputLayout) this.f2056r;
                textInputLayout.s(!textInputLayout.f8981b1, false);
                if (textInputLayout.f9013z) {
                    textInputLayout.n(editable.length());
                }
                if (textInputLayout.f8944G) {
                    textInputLayout.t(editable.length());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        int i10 = this.f2055q;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        switch (this.f2055q) {
            case 0:
            case 1:
                return;
            default:
                SearchView searchView = (SearchView) this.f2056r;
                Editable text = searchView.F.getText();
                searchView.f5510o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i10 = 8;
                if (searchView.f5509n0 && !searchView.f5502g0 && isEmpty) {
                    searchView.f5484K.setVisibility(8);
                    i10 = 0;
                }
                searchView.f5486M.setVisibility(i10);
                searchView.q();
                searchView.t();
                charSequence.toString();
                searchView.getClass();
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i7, int i8, int i9, CharSequence charSequence) {
    }

    private final void c(int i7, int i8, int i9, CharSequence charSequence) {
    }

    private final void d(int i7, int i8, int i9, CharSequence charSequence) {
    }

    private final void e(int i7, int i8, int i9, CharSequence charSequence) {
    }

    private final void f(int i7, int i8, int i9, CharSequence charSequence) {
    }
}
