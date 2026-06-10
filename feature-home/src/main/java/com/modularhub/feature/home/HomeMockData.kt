package com.modularhub.feature.home

data class HomeProduct(
    val id: String,
    val name: String,
    val price: String,
    val tag: String,
)

object HomeMockData {
    fun products(): List<HomeProduct> = listOf(
        HomeProduct("1", "ModularHub 定制 T 恤", "¥99", "热卖"),
        HomeProduct("2", "组件化架构实战手册", "¥68", "新品"),
        HomeProduct("3", "Gradle 插件开发指南", "¥88", "推荐"),
        HomeProduct("4", "Android 模块化贴纸", "¥19", "周边"),
        HomeProduct("5", "YAML 配置速查卡", "¥9.9", "工具"),
    )
}
