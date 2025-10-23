package com.boxhdo.android.tv;

import X.i;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.a;
import androidx.databinding.d;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.customviews.CustomMenuItem;
import com.boxhdo.android.tv.customviews.CustomNavigationView;
import com.boxhdo.android.tv.customviews.CustomVerticalGridView;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import h1.l;
import j1.AbstractC0783A;
import j1.AbstractC0785C;
import j1.AbstractC0787E;
import j1.AbstractC0789G;
import j1.AbstractC0791I;
import j1.AbstractC0793K;
import j1.AbstractC0795M;
import j1.AbstractC0798P;
import j1.AbstractC0800S;
import j1.AbstractC0802U;
import j1.AbstractC0803a;
import j1.AbstractC0805c;
import j1.AbstractC0809g;
import j1.AbstractC0811i;
import j1.AbstractC0815m;
import j1.AbstractC0817o;
import j1.AbstractC0819q;
import j1.AbstractC0821s;
import j1.AbstractC0825w;
import j1.AbstractC0827y;
import j1.C0784B;
import j1.C0786D;
import j1.C0788F;
import j1.C0790H;
import j1.C0792J;
import j1.C0794L;
import j1.C0796N;
import j1.C0797O;
import j1.C0799Q;
import j1.C0801T;
import j1.C0804b;
import j1.C0806d;
import j1.C0808f;
import j1.C0810h;
import j1.C0812j;
import j1.C0814l;
import j1.C0816n;
import j1.C0818p;
import j1.C0820r;
import j1.C0822t;
import j1.C0824v;
import j1.C0826x;
import j1.C0828z;
import j1.V;
import j1.W;
import j1.X;
import j1.Y;
import j1.Z;
import j1.b0;
import j1.c0;
import j1.d0;
import j1.e0;
import j1.f0;
import j1.g0;
import j1.h0;
import j1.j0;
import j1.l0;
import j1.n0;
import j1.o0;
import j1.p0;
import java.util.ArrayList;
import java.util.List;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public class DataBinderMapperImpl extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f7774a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(34);
        f7774a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_player, 1);
        sparseIntArray.put(R.layout.activity_tv, 2);
        sparseIntArray.put(R.layout.custom_button, 3);
        sparseIntArray.put(R.layout.dialog_tv_select_quality, 4);
        sparseIntArray.put(R.layout.dialog_tv_select_speed, 5);
        sparseIntArray.put(R.layout.fragment_player_loading, 6);
        sparseIntArray.put(R.layout.fragment_tv_choose_subtitle, 7);
        sparseIntArray.put(R.layout.fragment_tv_episode_list, 8);
        sparseIntArray.put(R.layout.fragment_tv_login, 9);
        sparseIntArray.put(R.layout.fragment_tv_main, 10);
        sparseIntArray.put(R.layout.fragment_tv_movie_detail, 11);
        sparseIntArray.put(R.layout.fragment_tv_player_control, 12);
        sparseIntArray.put(R.layout.fragment_tv_setting_player, 13);
        sparseIntArray.put(R.layout.fragment_tv_settings, 14);
        sparseIntArray.put(R.layout.fragment_tv_splash, 15);
        sparseIntArray.put(R.layout.fragment_tv_update, 16);
        sparseIntArray.put(R.layout.item_continue_watch, 17);
        sparseIntArray.put(R.layout.item_episode, 18);
        sparseIntArray.put(R.layout.item_menu, 19);
        sparseIntArray.put(R.layout.item_movie, 20);
        sparseIntArray.put(R.layout.item_movie_shimmer, 21);
        sparseIntArray.put(R.layout.item_network, 22);
        sparseIntArray.put(R.layout.item_player_settings, 23);
        sparseIntArray.put(R.layout.item_relate, 24);
        sparseIntArray.put(R.layout.item_season, 25);
        sparseIntArray.put(R.layout.item_subtitle, 26);
        sparseIntArray.put(R.layout.layout_error, 27);
        sparseIntArray.put(R.layout.layout_movie_preview_home, 28);
        sparseIntArray.put(R.layout.layout_no_result, 29);
        sparseIntArray.put(R.layout.layout_search, 30);
        sparseIntArray.put(R.layout.layout_shimmer_home, 31);
        sparseIntArray.put(R.layout.layout_shimmer_my_list, 32);
        sparseIntArray.put(R.layout.layout_shimmer_network, 33);
        sparseIntArray.put(R.layout.menu_layout, 34);
    }

    @Override // androidx.databinding.a
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, androidx.databinding.d, j1.c, j1.d] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.databinding.d, j1.f] */
    /* JADX WARN: Type inference failed for: r0v198, types: [j1.G, j1.H, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r0v240, types: [j1.M, j1.N, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r0v248, types: [j1.P, j1.Q, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r0v252, types: [androidx.databinding.d, j1.S, j1.T] */
    /* JADX WARN: Type inference failed for: r0v256, types: [androidx.databinding.d, j1.U, j1.V] */
    /* JADX WARN: Type inference failed for: r0v276, types: [j1.b0, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r0v313, types: [java.lang.Object, androidx.databinding.d, j1.f0, j1.e0] */
    /* JADX WARN: Type inference failed for: r0v317, types: [j1.h0, androidx.databinding.d, j1.g0] */
    /* JADX WARN: Type inference failed for: r0v47, types: [j1.i, j1.j, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r0v51, types: [j1.l, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r0v55, types: [j1.m, j1.n, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j1.a, androidx.databinding.d, j1.b] */
    /* JADX WARN: Type inference failed for: r0v84, types: [j1.q, androidx.databinding.d, j1.r] */
    /* JADX WARN: Type inference failed for: r0v88, types: [androidx.databinding.d, j1.s, j1.t] */
    /* JADX WARN: Type inference failed for: r10v1, types: [j1.g, j1.h, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r12v5, types: [androidx.databinding.d, j1.E, j1.F] */
    /* JADX WARN: Type inference failed for: r1v134, types: [j1.o0, java.lang.Object, androidx.databinding.d, j1.p0] */
    /* JADX WARN: Type inference failed for: r1v52, types: [j1.w, j1.x, java.lang.Object, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.databinding.d, j1.C, j1.D] */
    /* JADX WARN: Type inference failed for: r6v16, types: [j1.K, j1.L, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j1.W, j1.X, java.lang.Object, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r6v18, types: [j1.Y, j1.Z, java.lang.Object, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r6v8, types: [j1.y, j1.z, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r7v16, types: [j1.I, j1.J, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r8v3, types: [j1.o, j1.p, androidx.databinding.d] */
    /* JADX WARN: Type inference failed for: r8v6, types: [j1.A, androidx.databinding.d, j1.B] */
    /* JADX WARN: Type inference failed for: r9v12, types: [j1.c0, androidx.databinding.d, j1.d0] */
    @Override // androidx.databinding.a
    public final d b(View view, int i7) {
        int i8 = f7774a.get(i7);
        if (i8 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i8) {
                    case 1:
                        if ("layout/activity_player_0".equals(tag)) {
                            Object[] N02 = d.N0(view, 3, null, C0804b.f11609t);
                            FrameLayout frameLayout = (FrameLayout) N02[2];
                            ?? abstractC0803a = new AbstractC0803a(null, view, (StyledPlayerView) N02[1]);
                            abstractC0803a.f11610s = -1L;
                            ((FrameLayout) N02[0]).setTag(null);
                            abstractC0803a.Q0(view);
                            abstractC0803a.L0();
                            return abstractC0803a;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for activity_player is invalid. Received: "));
                    case 2:
                        if ("layout/activity_tv_0".equals(tag)) {
                            Object[] N03 = d.N0(view, 3, null, C0806d.f11622u);
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) N03[1];
                            ?? abstractC0805c = new AbstractC0805c(null, view, (FrameLayout) N03[0], (ProgressBar) N03[2]);
                            abstractC0805c.f11623t = -1L;
                            abstractC0805c.f11613r.setTag(null);
                            view.setTag(R.id.dataBinding, abstractC0805c);
                            abstractC0805c.L0();
                            return abstractC0805c;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for activity_tv is invalid. Received: "));
                    case 3:
                        if ("layout/custom_button_0".equals(tag)) {
                            Object[] N04 = d.N0(view, 3, null, C0808f.f11629s);
                            ImageView imageView = (ImageView) N04[1];
                            TextView textView = (TextView) N04[2];
                            ?? dVar = new d(null, view, 0);
                            dVar.f11630r = -1L;
                            ((LinearLayout) N04[0]).setTag(null);
                            dVar.Q0(view);
                            dVar.L0();
                            return dVar;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for custom_button is invalid. Received: "));
                    case 4:
                        if ("layout/dialog_tv_select_quality_0".equals(tag)) {
                            Object[] N05 = d.N0(view, 10, null, C0810h.f11643A);
                            RadioButton radioButton = (RadioButton) N05[4];
                            RadioButton radioButton2 = (RadioButton) N05[5];
                            RadioGroup radioGroup = (RadioGroup) N05[3];
                            RadioButton radioButton3 = (RadioButton) N05[6];
                            RadioButton radioButton4 = (RadioButton) N05[8];
                            RadioButton radioButton5 = (RadioButton) N05[7];
                            ImageView imageView2 = (ImageView) N05[9];
                            FrameLayout frameLayout2 = (FrameLayout) N05[1];
                            TextView textView2 = (TextView) N05[2];
                            ?? abstractC0809g = new AbstractC0809g(null, view, radioButton, radioButton2, radioGroup, radioButton3, radioButton4, radioButton5, imageView2);
                            abstractC0809g.f11644z = -1L;
                            ((FrameLayout) N05[0]).setTag(null);
                            abstractC0809g.Q0(view);
                            abstractC0809g.L0();
                            return abstractC0809g;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for dialog_tv_select_quality is invalid. Received: "));
                    case 5:
                        if ("layout/dialog_tv_select_speed_0".equals(tag)) {
                            Object[] N06 = d.N0(view, 13, null, C0812j.f11653v);
                            FrameLayout frameLayout3 = (FrameLayout) N06[1];
                            RadioButton radioButton6 = (RadioButton) N06[4];
                            RadioButton radioButton7 = (RadioButton) N06[5];
                            RadioButton radioButton8 = (RadioButton) N06[6];
                            RadioButton radioButton9 = (RadioButton) N06[7];
                            RadioButton radioButton10 = (RadioButton) N06[8];
                            RadioButton radioButton11 = (RadioButton) N06[9];
                            RadioButton radioButton12 = (RadioButton) N06[10];
                            RadioButton radioButton13 = (RadioButton) N06[11];
                            TextView textView3 = (TextView) N06[2];
                            ?? abstractC0811i = new AbstractC0811i(null, view, (RadioGroup) N06[3], (ImageView) N06[12]);
                            abstractC0811i.f11654u = -1L;
                            ((FrameLayout) N06[0]).setTag(null);
                            abstractC0811i.Q0(view);
                            abstractC0811i.L0();
                            return abstractC0811i;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for dialog_tv_select_speed is invalid. Received: "));
                    case i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if ("layout/fragment_player_loading_0".equals(tag)) {
                            Object[] N07 = d.N0(view, 4, null, C0814l.f11670t);
                            ProgressBar progressBar = (ProgressBar) N07[2];
                            TextView textView4 = (TextView) N07[3];
                            View view2 = (View) N07[1];
                            ?? dVar2 = new d(null, view, 0);
                            dVar2.f11671s = -1L;
                            ((ConstraintLayout) N07[0]).setTag(null);
                            dVar2.Q0(view);
                            dVar2.L0();
                            return dVar2;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_player_loading is invalid. Received: "));
                    case i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if ("layout/fragment_tv_choose_subtitle_0".equals(tag)) {
                            Object[] N08 = d.N0(view, 4, null, C0816n.f11686u);
                            TextView textView5 = (TextView) N08[2];
                            ?? abstractC0815m = new AbstractC0815m(null, view, (ImageView) N08[1], (DpadRecyclerView) N08[3]);
                            abstractC0815m.f11687t = -1L;
                            ((ConstraintLayout) N08[0]).setTag(null);
                            abstractC0815m.Q0(view);
                            abstractC0815m.L0();
                            return abstractC0815m;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_choose_subtitle is invalid. Received: "));
                    case 8:
                        if ("layout/fragment_tv_episode_list_0".equals(tag)) {
                            Object[] N09 = d.N0(view, 8, null, C0818p.f11709x);
                            Guideline guideline = (Guideline) N09[1];
                            LinearLayout linearLayout = (LinearLayout) N09[3];
                            ?? abstractC0817o = new AbstractC0817o(null, view, (CustomVerticalGridView) N09[7], (CustomVerticalGridView) N09[6], (TextView) N09[2], (TextView) N09[5], (TextView) N09[4]);
                            abstractC0817o.f11710w = -1L;
                            ((ConstraintLayout) N09[0]).setTag(null);
                            abstractC0817o.Q0(view);
                            abstractC0817o.L0();
                            return abstractC0817o;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_episode_list is invalid. Received: "));
                    case 9:
                        if ("layout/fragment_tv_login_0".equals(tag)) {
                            Object[] N010 = d.N0(view, 5, null, C0820r.f11715u);
                            TextView textView6 = (TextView) N010[2];
                            TextView textView7 = (TextView) N010[4];
                            ?? abstractC0819q = new AbstractC0819q(null, view, (TextView) N010[1], (TextView) N010[3]);
                            abstractC0819q.f11716t = -1L;
                            ((ConstraintLayout) N010[0]).setTag(null);
                            abstractC0819q.Q0(view);
                            abstractC0819q.L0();
                            return abstractC0819q;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_login is invalid. Received: "));
                    case 10:
                        if ("layout/fragment_tv_main_0".equals(tag)) {
                            Object[] N011 = d.N0(view, 3, null, C0822t.f11718t);
                            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) N011[2];
                            ?? abstractC0821s = new AbstractC0821s(null, view, (CustomNavigationView) N011[1]);
                            abstractC0821s.f11719s = -1L;
                            ((ConstraintLayout) N011[0]).setTag(null);
                            abstractC0821s.Q0(view);
                            abstractC0821s.L0();
                            return abstractC0821s;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_main is invalid. Received: "));
                    case 11:
                        if ("layout/fragment_tv_movie_detail_0".equals(tag)) {
                            return new C0824v(view);
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_movie_detail is invalid. Received: "));
                    case 12:
                        if ("layout/fragment_tv_player_control_0".equals(tag)) {
                            Object[] N012 = d.N0(view, 13, null, C0826x.F);
                            ?? abstractC0825w = new AbstractC0825w(null, view, (ImageView) N012[1], (ImageView) N012[6], (TextView) N012[3], (TextView) N012[5], (TextView) N012[4], (TextView) N012[9], (DefaultTimeBar) N012[7], (LinearLayout) N012[10], (ConstraintLayout) N012[0], (TextView) N012[2], (TextView) N012[8], (TextView) N012[12], (TextView) N012[11]);
                            abstractC0825w.f11753E = -1L;
                            abstractC0825w.f11752z.setTag(null);
                            view.setTag(R.id.dataBinding, abstractC0825w);
                            abstractC0825w.L0();
                            return abstractC0825w;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_player_control is invalid. Received: "));
                    case 13:
                        if ("layout/fragment_tv_setting_player_0".equals(tag)) {
                            Object[] N013 = d.N0(view, 4, null, C0828z.f11757v);
                            ?? abstractC0827y = new AbstractC0827y(null, view, (ImageView) N013[2], (RecyclerView) N013[3], (TextView) N013[1]);
                            abstractC0827y.f11758u = -1L;
                            ((FrameLayout) N013[0]).setTag(null);
                            abstractC0827y.Q0(view);
                            abstractC0827y.L0();
                            return abstractC0827y;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_setting_player is invalid. Received: "));
                    case 14:
                        if ("layout/fragment_tv_settings_0".equals(tag)) {
                            Object[] N014 = d.N0(view, 7, null, C0784B.f11541x);
                            TextView textView8 = (TextView) N014[5];
                            ?? abstractC0783A = new AbstractC0783A(null, view, (TextView) N014[2], (RelativeLayout) N014[4], (RelativeLayout) N014[1], (TextView) N014[6], (TextView) N014[3]);
                            abstractC0783A.f11542w = -1L;
                            ((LinearLayout) N014[0]).setTag(null);
                            abstractC0783A.Q0(view);
                            abstractC0783A.L0();
                            return abstractC0783A;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_settings is invalid. Received: "));
                    case 15:
                        if ("layout/fragment_tv_splash_0".equals(tag)) {
                            Object[] N015 = d.N0(view, 4, null, C0786D.f11546v);
                            ?? abstractC0785C = new AbstractC0785C(null, view, (Button) N015[3], (ImageView) N015[1], (ProgressBar) N015[2]);
                            abstractC0785C.f11547u = -1L;
                            ((ConstraintLayout) N015[0]).setTag(null);
                            abstractC0785C.Q0(view);
                            abstractC0785C.L0();
                            return abstractC0785C;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_splash is invalid. Received: "));
                    case 16:
                        if ("layout/fragment_tv_update_0".equals(tag)) {
                            Object[] N016 = d.N0(view, 15, null, C0788F.f11557B);
                            TextView textView9 = (TextView) N016[14];
                            TextView textView10 = (TextView) N016[6];
                            TextView textView11 = (TextView) N016[5];
                            TextView textView12 = (TextView) N016[4];
                            ImageView imageView3 = (ImageView) N016[9];
                            ImageView imageView4 = (ImageView) N016[1];
                            ImageView imageView5 = (ImageView) N016[7];
                            ConstraintLayout constraintLayout = (ConstraintLayout) N016[8];
                            ProgressBar progressBar2 = (ProgressBar) N016[12];
                            TextView textView13 = (TextView) N016[3];
                            TextView textView14 = (TextView) N016[13];
                            TextView textView15 = (TextView) N016[2];
                            TextView textView16 = (TextView) N016[10];
                            TextView textView17 = (TextView) N016[11];
                            ?? abstractC0787E = new AbstractC0787E(null, view, textView9, textView10, textView11, textView12, imageView5, constraintLayout, progressBar2, textView13, textView14);
                            abstractC0787E.f11558A = -1L;
                            ((FrameLayout) N016[0]).setTag(null);
                            abstractC0787E.Q0(view);
                            abstractC0787E.L0();
                            return abstractC0787E;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for fragment_tv_update is invalid. Received: "));
                    case 17:
                        if ("layout/item_continue_watch_0".equals(tag)) {
                            Object[] N017 = d.N0(view, 4, null, C0790H.f11562v);
                            View view3 = (View) N017[1];
                            ?? abstractC0789G = new AbstractC0789G(null, view, (ImageView) N017[2], (ProgressBar) N017[3]);
                            abstractC0789G.f11563u = -1L;
                            ((FrameLayout) N017[0]).setTag(null);
                            abstractC0789G.Q0(view);
                            abstractC0789G.L0();
                            return abstractC0789G;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_continue_watch is invalid. Received: "));
                    case 18:
                        if ("layout/item_episode_0".equals(tag)) {
                            Object[] N018 = d.N0(view, 7, null, C0792J.f11569x);
                            ImageView imageView6 = (ImageView) N018[1];
                            ImageView imageView7 = (ImageView) N018[3];
                            TextView textView18 = (TextView) N018[4];
                            TextView textView19 = (TextView) N018[6];
                            ?? abstractC0791I = new AbstractC0791I(null, view, imageView6, textView18, (TextView) N018[5], (View) N018[2]);
                            abstractC0791I.f11570w = -1L;
                            ((ConstraintLayout) N018[0]).setTag(null);
                            abstractC0791I.Q0(view);
                            abstractC0791I.L0();
                            return abstractC0791I;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_episode is invalid. Received: "));
                    case 19:
                        if ("layout/item_menu_0".equals(tag)) {
                            Object[] N019 = d.N0(view, 4, null, C0794L.f11574v);
                            ?? abstractC0793K = new AbstractC0793K(null, view, (ImageView) N019[1], (TextView) N019[2], (View) N019[3]);
                            abstractC0793K.f11575u = -1L;
                            ((RelativeLayout) N019[0]).setTag(null);
                            abstractC0793K.Q0(view);
                            abstractC0793K.L0();
                            return abstractC0793K;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_menu is invalid. Received: "));
                    case 20:
                        if ("layout/item_movie_0".equals(tag)) {
                            Object[] N020 = d.N0(view, 3, null, C0796N.f11578u);
                            View view4 = (View) N020[1];
                            ?? abstractC0795M = new AbstractC0795M(null, view, (ImageView) N020[2]);
                            abstractC0795M.f11579t = -1L;
                            ((FrameLayout) N020[0]).setTag(null);
                            abstractC0795M.Q0(view);
                            abstractC0795M.L0();
                            return abstractC0795M;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_movie is invalid. Received: "));
                    case 21:
                        if ("layout/item_movie_shimmer_0".equals(tag)) {
                            C0797O c0797o = new C0797O(null, view, (View) d.N0(view, 1, null, null)[0]);
                            c0797o.f11581s = -1L;
                            c0797o.f11580r.setTag(null);
                            view.setTag(R.id.dataBinding, c0797o);
                            c0797o.L0();
                            return c0797o;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_movie_shimmer is invalid. Received: "));
                    case 22:
                        if ("layout/item_network_0".equals(tag)) {
                            Object[] N021 = d.N0(view, 2, null, C0799Q.f11584u);
                            ?? abstractC0798P = new AbstractC0798P(null, view, (ImageView) N021[1]);
                            abstractC0798P.f11585t = -1L;
                            ((ConstraintLayout) N021[0]).setTag(null);
                            abstractC0798P.Q0(view);
                            abstractC0798P.L0();
                            return abstractC0798P;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_network is invalid. Received: "));
                    case 23:
                        if ("layout/item_player_settings_0".equals(tag)) {
                            Object[] N022 = d.N0(view, 3, null, C0801T.f11589v);
                            ?? abstractC0800S = new AbstractC0800S(null, view, (ImageView) N022[2], (TextView) N022[1]);
                            abstractC0800S.f11590u = -1L;
                            ((FrameLayout) N022[0]).setTag(null);
                            abstractC0800S.Q0(view);
                            abstractC0800S.L0();
                            return abstractC0800S;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_player_settings is invalid. Received: "));
                    case 24:
                        if ("layout/item_relate_0".equals(tag)) {
                            Object[] N023 = d.N0(view, 3, null, V.f11593u);
                            View view5 = (View) N023[1];
                            ?? abstractC0802U = new AbstractC0802U(null, view, (ImageView) N023[2]);
                            abstractC0802U.f11594t = -1L;
                            ((FrameLayout) N023[0]).setTag(null);
                            abstractC0802U.Q0(view);
                            abstractC0802U.L0();
                            return abstractC0802U;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_relate is invalid. Received: "));
                    case 25:
                        if ("layout/item_season_0".equals(tag)) {
                            Object[] N024 = d.N0(view, 3, null, X.f11599w);
                            ?? w7 = new W(null, view, (TextView) N024[2], (TextView) N024[1], (ConstraintLayout) N024[0]);
                            w7.f11600v = -1L;
                            w7.f11598t.setTag(null);
                            view.setTag(R.id.dataBinding, w7);
                            w7.L0();
                            return w7;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_season is invalid. Received: "));
                    case 26:
                        if ("layout/item_subtitle_0".equals(tag)) {
                            Object[] N025 = d.N0(view, 3, null, Z.f11605w);
                            ?? y3 = new Y(null, view, (TextView) N025[2], (TextView) N025[1], (RelativeLayout) N025[0]);
                            y3.f11606v = -1L;
                            y3.f11604t.setTag(null);
                            view.setTag(R.id.dataBinding, y3);
                            y3.L0();
                            return y3;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for item_subtitle is invalid. Received: "));
                    case 27:
                        if ("layout/layout_error_0".equals(tag)) {
                            Object[] N026 = d.N0(view, 3, null, b0.f11611t);
                            TextView textView20 = (TextView) N026[2];
                            TextView textView21 = (TextView) N026[1];
                            ?? dVar3 = new d(null, view, 0);
                            dVar3.f11612s = -1L;
                            ((LinearLayout) N026[0]).setTag(null);
                            dVar3.Q0(view);
                            dVar3.L0();
                            return dVar3;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for layout_error is invalid. Received: "));
                    case 28:
                        if ("layout/layout_movie_preview_home_0".equals(tag)) {
                            Object[] N027 = d.N0(view, 11, null, d0.f11624z);
                            Guideline guideline2 = (Guideline) N027[4];
                            Guideline guideline3 = (Guideline) N027[1];
                            ImageView imageView8 = (ImageView) N027[2];
                            TextView textView22 = (TextView) N027[8];
                            ImageView imageView9 = (ImageView) N027[3];
                            ?? c0Var = new c0(null, view, imageView8, (LinearLayout) N027[6], (TextView) N027[5], (TextView) N027[10], (TextView) N027[7], (TextView) N027[9]);
                            c0Var.f11625y = -1L;
                            ((ConstraintLayout) N027[0]).setTag(null);
                            c0Var.Q0(view);
                            c0Var.L0();
                            return c0Var;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for layout_movie_preview_home is invalid. Received: "));
                    case 29:
                        if ("layout/layout_no_result_0".equals(tag)) {
                            Object[] N028 = d.N0(view, 2, null, f0.f11631v);
                            ?? e0Var = new e0(null, view, (LinearLayout) N028[0], (TextView) N028[1]);
                            e0Var.f11632u = -1L;
                            e0Var.f11627r.setTag(null);
                            view.setTag(R.id.dataBinding, e0Var);
                            e0Var.L0();
                            return e0Var;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for layout_no_result is invalid. Received: "));
                    case 30:
                        if ("layout/layout_search_0".equals(tag)) {
                            Object[] N029 = d.N0(view, 2, null, h0.f11645u);
                            ?? g0Var = new g0(null, view, (EditText) N029[1]);
                            g0Var.f11646t = -1L;
                            ((FrameLayout) N029[0]).setTag(null);
                            g0Var.Q0(view);
                            g0Var.L0();
                            return g0Var;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for layout_search is invalid. Received: "));
                    case 31:
                        if ("layout/layout_shimmer_home_0".equals(tag)) {
                            return new j0(view);
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for layout_shimmer_home is invalid. Received: "));
                    case 32:
                        if ("layout/layout_shimmer_my_list_0".equals(tag)) {
                            return new l0(view);
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for layout_shimmer_my_list is invalid. Received: "));
                    case 33:
                        if ("layout/layout_shimmer_network_0".equals(tag)) {
                            return new n0(view);
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for layout_shimmer_network is invalid. Received: "));
                    case 34:
                        if ("layout/menu_layout_0".equals(tag)) {
                            Object[] N030 = d.N0(view, 7, null, p0.f11711z);
                            ?? o0Var = new o0(null, view, (CustomMenuItem) N030[1], (CustomMenuItem) N030[2], (CustomMenuItem) N030[4], (ConstraintLayout) N030[0], (CustomMenuItem) N030[5], (CustomMenuItem) N030[6], (CustomMenuItem) N030[3]);
                            o0Var.f11712y = -1L;
                            o0Var.f11705u.setTag(null);
                            view.setTag(R.id.dataBinding, o0Var);
                            o0Var.L0();
                            return o0Var;
                        }
                        throw new IllegalArgumentException(AbstractC1111a.p(tag, "The tag for menu_layout is invalid. Received: "));
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.a
    public final d c(View[] viewArr, int i7) {
        if (viewArr.length == 0 || f7774a.get(i7) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.a
    public final int d(String str) {
        Integer num;
        if (str == null || (num = (Integer) l.f10961a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
