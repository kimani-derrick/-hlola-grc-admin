package com.boxhdo.android.tv.navigation;

import M5.g;
import android.content.Context;
import androidx.fragment.app.S;
import androidx.navigation.fragment.NavHostFragment;
import com.boxhdo.android.tv.R;
import m1.C0986a;
import n0.N;
/* loaded from: classes.dex */
public final class CustomNavHostFragment extends NavHostFragment {
    @Override // androidx.navigation.fragment.NavHostFragment
    public final N f0() {
        Context a02 = a0();
        S n = n();
        g.e(n, "childFragmentManager");
        int i7 = this.f6110N;
        if (i7 == 0 || i7 == -1) {
            i7 = R.id.nav_host_fragment;
        }
        return new C0986a(a02, n, i7);
    }
}
