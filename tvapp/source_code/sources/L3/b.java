package L3;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
/* loaded from: classes.dex */
public final class b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2058b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f2057a = i7;
        this.f2058b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z7) {
        switch (this.f2057a) {
            case 0:
                boolean z8 = true;
                ((h) this.f2058b).d(((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z7) ? false : false);
                return;
            case 1:
                q qVar = (q) this.f2058b;
                qVar.f2096a.setEndIconActivated(z7);
                if (!z7) {
                    qVar.g(false);
                    qVar.f2089i = false;
                    return;
                }
                return;
            default:
                SearchView searchView = (SearchView) this.f2058b;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f5499d0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z7);
                    return;
                }
                return;
        }
    }
}
