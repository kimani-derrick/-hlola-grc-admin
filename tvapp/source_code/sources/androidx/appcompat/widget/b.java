package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ SearchView f5567q;

    public b(SearchView searchView) {
        this.f5567q = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        int length;
        SearchView searchView = this.f5567q;
        if (searchView.f5513r0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
        if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
            if (searchView.f5513r0 == null || searchView.f5503h0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i7 != 66 && i7 != 84 && i7 != 61) {
                if (i7 != 21 && i7 != 22) {
                    if (i7 != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                if (i7 == 21) {
                    length = 0;
                } else {
                    length = searchAutoComplete.length();
                }
                searchAutoComplete.setSelection(length);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
            } else {
                searchView.m(searchAutoComplete.getListSelection());
            }
            return true;
        } else if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i7 != 66) {
            return false;
        } else {
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.i("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }
}
