package com.example.nikeapp.core.model.dummy

import com.example.nikeapp.R
import com.example.nikeapp.core.model.Product
import com.example.nikeapp.ui.home.model.HomeInfo
import com.example.nikeapp.ui.storeLocator.model.Store

object Dummy {
    val productList = listOf(
        Product(
            id = "1",
            name = "나이키 줌X 베이퍼플라이 NEXT% 2",
            price = 249000,
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvQxX0D0oJZ6PyKqfj36sy1j8kone-tIcRHg&s",
            description = "경기에서 최고 속도를 경험하세요."
        ),
        Product(
            id = "2",
            name = "에어 맥스 97 OG",
            price = 179000,
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYgEIDOokdA2p6R1rzZradIiBFlGiuuS8RAQ&s",
            description = "90년대 클래식의 복원, 편안함과 스타일."
        ),
        Product(
            id = "3",
            name = "조던 1 레트로 하이 OG",
            price = 229000,
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQK-3tF4W6UQsLzCcCw7wKhhGorrHR2i_qmNQ&s",
            description = "하이탑 스타일의 전설적인 농구화."
        ),
        Product(
            id = "4",
            name = "나이키 리액트 인피니티 러너 2",
            price = 139000,
            image = "https://img.danawa.com/prod_img/500000/848/146/img/13146848_1.jpg?_v=20220714101847&shrink=360:360",
            description = "더 편안한 착용감을 위한 디자인."
        ),
        Product(
            id = "5",
            name = "에어 맥스 90 바이퍼",
            price = 149000,
            image = "https://images.stockx.com/images/Nike-Air-Max-Plus-Black-Viper-GS.png?fit=fill&bg=FFFFFF&w=700&h=500&fm=webp&auto=compress&q=90&dpr=2&trim=color&updated_at=1617289188",
            description = "편안하고 스타일리시한 스니커즈."
        ),
        Product(
            id = "6",
            name = "나이키 에어 포스 1 '07",
            price = 129000,
            image = "https://static.nike.com/a/images/t_PDP_936_v1/f_auto,q_auto:eco/b7d9211c-26e7-431a-ac24-b0540fb3c00f/AIR+FORCE+1+%2707.png",
            description = "클래식한 디자인으로 어떤 스타일에도 잘 어울리는 스니커즈."
        ),
        Product(
            id = "7",
            name = "나이키 SB 덩크 로우 프로",
            price = 169000,
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTb3pDJo-9XHISH3se6jIAAcMvvvb6HI2SV0Q&s",
            description = "스케이트보드를 위한 최상의 그립."
        ),
        Product(
            id = "8",
            name = "나이키 에어 줌 페가수스 39",
            price = 159000,
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_PLscMUPME7xQydFPrKqJvG_ln-BKlQQ80Q&s",
            description = "하이퍼 반응성의 러닝화."
        ),
        Product(
            id = "9",
            name = "나이키 에어 리베로",
            price = 179000,
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtofUtBn7ZGfdlXMCoQXL-YFlQJG1FoWuynA&s",
            description = "퍼포먼스를 위한 실용적인 디자인."
        ),
        Product(
            id = "10",
            name = "조던 4 OG 레트로",
            price = 239000,
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6dXy7faaVrrsn__uSu04lbBg1hpBYhmeQvw&s",
            description = "편안한 착용감과 높은 내구성."
        )
    )

    val homeList = listOf(
        HomeInfo(
            title = "아무나 오를 수 없는 승자의 자리.",
            description = "전부를 내건 이들만이 차지하는 것",
            buttonText = "자세히 보기",
            imageRes = R.drawable.main_card_1
        ),
        HomeInfo(
            title = "나이키 잼",
            subTitle = "신제품",
            description = "브레이킹을 위해 탄생한\n나이키 잼 컬렉션을 만나 보세요.",
            buttonText = "구매하기",
            imageRes = R.drawable.main_card_2
        ),
        HomeInfo(
            title = "나이키 X 자크뮈스",
            subTitle = "새로운 컬렉션",
            description = "세련된 실루엣과 감각적인 컬러가\n조화를 이루는 나이키 X 자크뮈스 컬렉션은\n스포츠웨어에 새로운 변화를 불러일으킵니다.",
            buttonText = "컬렉션 구매하기",
            imageRes = R.drawable.main_card_3
        )
    )

    val shoesSize = listOf(
        250, 255, 260, 265, 270, 275, 280, 285, 290, 295, 300, 305, 310
    )

    val stores = listOf(
        Store(
            name = "나이키 서울",
            subAddress = "명동길 14 눈스퀘어 1층",
            address = "중구, 서울특별시, 04536, KR",
            isOpen = true,
            closeTime = "오후 10:00"
        ),
        Store(
            name = "나이키 신세계 명동",
            subAddress = "소공로 63 신세계백화점 4층",
            address = "중구, 서울특별시, 04530, KR",
            isOpen = true,
            closeTime = "오후 08:00"
        ),
        Store(
            name = "나이키 롯데 명동",
            subAddress = "남대문로 73 롯데백화점 AVENUEL 6층",
            address = "중구, 서울특별시, 04533, KR",
            isOpen = true,
            closeTime = "오후 10:00"
        ),
        Store(
            name = "Nike Well Collective - 롯데 서울역",
            subAddress = "한강대로 405 롯데아울렛서울역점 2F",
            address = "용산구, 서울특별시, 04320, KR",
            isOpen = false,
            closeTime = "오후 09:00"
        )
    )

    val categories = listOf(
        "신발",
        "탑 & 티셔츠",
        "후디 & 크루",
        "재킷 & 베스트",
        "팬츠 & 타이츠",
        "쇼츠",
        "스포츠 브라",
        "트랙수트",
        "점프수트 & 롬퍼스",
        "스커트 & 드레스",
        "양말",
        "용품"
    )
}