package L3;

import H2.m0;
import O3.E;
import X2.J;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.leanback.widget.SearchBar;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.material.textfield.TextInputLayout;
import e2.K0;
import java.util.ArrayList;
import java.util.HashMap;
import k.N0;
import k.R0;
/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2063q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f2064r;

    public /* synthetic */ e(int i7, Object obj) {
        this.f2063q = i7;
        this.f2064r = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PasswordTransformationMethod passwordTransformationMethod;
        boolean z7;
        W2.u uVar;
        j.k kVar;
        switch (this.f2063q) {
            case 0:
                h hVar = (h) this.f2064r;
                Editable text = hVar.f2096a.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                TextInputLayout textInputLayout = hVar.f2096a;
                textInputLayout.k(textInputLayout.f9011x0, textInputLayout.f9014z0);
                return;
            case 1:
                q qVar = (q) this.f2064r;
                q.d(qVar, (AutoCompleteTextView) qVar.f2096a.getEditText());
                return;
            case 2:
                u uVar2 = (u) this.f2064r;
                EditText editText = uVar2.f2096a.getEditText();
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    if (u.d(uVar2)) {
                        passwordTransformationMethod = null;
                    } else {
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        editText.setSelection(selectionEnd);
                    }
                    TextInputLayout textInputLayout2 = uVar2.f2096a;
                    textInputLayout2.k(textInputLayout2.f9011x0, textInputLayout2.f9014z0);
                    return;
                }
                return;
            case 3:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f2064r;
                CheckedTextView checkedTextView = trackSelectionView.f8211s;
                HashMap hashMap = trackSelectionView.f8215w;
                boolean z8 = true;
                if (view == checkedTextView) {
                    trackSelectionView.f8208B = true;
                    hashMap.clear();
                } else if (view == trackSelectionView.f8212t) {
                    trackSelectionView.f8208B = false;
                    hashMap.clear();
                } else {
                    trackSelectionView.f8208B = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    J j7 = (J) tag;
                    K0 k02 = j7.f4146a;
                    m0 m0Var = k02.f9691r;
                    W2.u uVar3 = (W2.u) hashMap.get(m0Var);
                    int i7 = j7.f4147b;
                    if (uVar3 == null) {
                        if (!trackSelectionView.f8217y && hashMap.size() > 0) {
                            hashMap.clear();
                        }
                        uVar = new W2.u(m0Var, E.x(Integer.valueOf(i7)));
                    } else {
                        ArrayList arrayList = new ArrayList(uVar3.f3883r);
                        boolean isChecked = ((CheckedTextView) view).isChecked();
                        if (trackSelectionView.f8216x && k02.f9692s) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (!z7 && (!trackSelectionView.f8217y || trackSelectionView.f8214v.size() <= 1)) {
                            z8 = false;
                        }
                        if (isChecked && z8) {
                            arrayList.remove(Integer.valueOf(i7));
                            if (arrayList.isEmpty()) {
                                hashMap.remove(m0Var);
                            } else {
                                uVar = new W2.u(m0Var, arrayList);
                            }
                        } else if (!isChecked) {
                            if (z7) {
                                arrayList.add(Integer.valueOf(i7));
                                uVar = new W2.u(m0Var, arrayList);
                            } else {
                                uVar = new W2.u(m0Var, E.x(Integer.valueOf(i7)));
                            }
                        }
                    }
                    hashMap.put(m0Var, uVar);
                }
                trackSelectionView.a();
                return;
            case 4:
                SearchBar searchBar = (SearchBar) this.f2064r;
                if (searchBar.f6501L) {
                    searchBar.b();
                    return;
                } else {
                    searchBar.a();
                    return;
                }
            case 5:
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f2064r;
                int i8 = jVar.f8870r0;
                if (i8 == 2) {
                    jVar.g0(1);
                    return;
                } else if (i8 == 1) {
                    jVar.g0(2);
                    return;
                } else {
                    return;
                }
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.material.datepicker.k kVar2 = (com.google.android.material.datepicker.k) this.f2064r;
                Button button = kVar2.f8887P0;
                kVar2.getClass();
                throw null;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                N0 n02 = ((Toolbar) this.f2064r).f5546d0;
                if (n02 == null) {
                    kVar = null;
                } else {
                    kVar = n02.f11913r;
                }
                if (kVar != null) {
                    kVar.collapseActionView();
                    return;
                }
                return;
            default:
                R0 r02 = (R0) this.f2064r;
                if (r02.f11938k != null) {
                    r02.getClass();
                    return;
                }
                return;
        }
    }

    public e(R0 r02) {
        this.f2063q = 8;
        this.f2064r = r02;
        r02.f11930a.getContext();
    }
}
